package com.hong.pay.config;

import com.alibaba.fastjson.JSONObject;
import com.hong.common.log.LogAnnotation;
import com.hong.common.validate.CommonCheckLogger;
import com.hong.common.validate.ValidateFiled;
import com.hong.common.validate.ValidateGroup;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Dictionary;
import java.util.Map;

@Order(1)
@Aspect
@Component
public class CommonCheckerAspect {

	private static final Logger logger = LoggerFactory.getLogger(CommonCheckLogger.class);

	/**
	 * 使用AOP对使用了ValidateGroup的方法进行代理校验 可以直接在此处做植入，可以减少代码量
	 * 
	 * @throws Throwable
	 */
	@Around("@annotation(log)")
	public Object around(ProceedingJoinPoint joinPoint, LogAnnotation log) throws Throwable {
		Retinfo retinfo = new Retinfo(false, StringUtils.EMPTY);
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method;
		ValidateGroup annotation = null;
		Object[] args = null;

		try {
			//参数校验
			method = signature.getMethod();
			args = joinPoint.getArgs(); // 方法的参数
			annotation = (ValidateGroup) getAnnotationByMethod(method, ValidateGroup.class);
			if(annotation!=null){//开启validate注解采取校验
				retinfo = validateFiled(annotation.value(), args);
			}else{
				retinfo.flag=true;
			}
			if (retinfo.flag) {//校验通过
				Object resultObject = joinPoint.proceed();//调用被代理方法
				return resultObject;
			} else {
				return method.getReturnType().getConstructor(int.class, String.class).newInstance(-9999,retinfo.getMsg());
			}
			
		} catch (Exception e) {
			logger.error("CommonCheckServiceLogger validateAround方法异常:{}", e);
			throw e;
//			return new Result<>(-1, e.getMessage());
		}
		
	}

	/**
	 * 验证参数是否合法
	 */
	public Retinfo validateFiled(ValidateFiled[] valiedatefiles, Object[] args) throws SecurityException,
			IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		for (ValidateFiled validateFiled : valiedatefiles) {// 遍历约束，传入需要验证参数
			Object arg = null;
			if ("".equals(validateFiled.filedName())) {
				arg = args[validateFiled.index()];
			} else {
				arg = getFieldByObjectAndFileName(args[validateFiled.index()], validateFiled.filedName());
			}

			if (validateFiled.notNull()) { // 判断参数是否为空
				if (arg == null)
					return new Retinfo(false, validateFiled.msg());
			} else { // 如果该参数能够为空，并且当参数为空时，就不用判断后面的了 ，直接返回true
				if (arg == null)
					return new Retinfo(true, StringUtils.EMPTY);
			}

			if (validateFiled.notBlank()) {// 判断是否为空字符
				if (StringUtils.isBlank((CharSequence) arg)) {
					return new Retinfo(false, validateFiled.msg());
				}
			}

			if (validateFiled.maxLen() > 0) { // 判断字符串最大长度
				if (((String) arg).length() > validateFiled.maxLen())
					return new Retinfo(false, validateFiled.msg());
			}

			if (validateFiled.minLen() > 0) { // 判断字符串最小长度
				if (((String) arg).length() < validateFiled.minLen())
					return new Retinfo(false, validateFiled.msg());
			}

			if (validateFiled.maxVal() != -1) { // 判断数值最大值
			    String argParam=String.valueOf(arg);
				if (Long.valueOf(argParam)> validateFiled.maxVal())
					return new Retinfo(false, validateFiled.msg());
			}

			if (validateFiled.minVal() != -1) { // 判断数值最小值
			    String argParam=String.valueOf(arg);
				if (Long.valueOf(argParam) < validateFiled.minVal())
					return new Retinfo(false, validateFiled.msg());
			}

			if (!"".equals(validateFiled.regStr())) { // 判断正则
				if (arg instanceof String) {
					if (!((String) arg).matches(validateFiled.regStr()))
						return new Retinfo(false, validateFiled.msg());
				} else {
					return new Retinfo(false, validateFiled.msg());
				}
			}
		}
		return new Retinfo(true, StringUtils.EMPTY);
	}

	/**
	 * 根据对象和属性名得到 属性
	 */
	public Object getFieldByObjectAndFileName(Object targetObj, String fileName) throws SecurityException,
			NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Object arg = targetObj;
		// 判断是否map
		if (Map.class.isInstance(arg) || Dictionary.class.isInstance(arg) || JSONObject.class.isInstance(arg)) {
			Method get = arg.getClass().getMethod("get", Object.class);
			arg = get.invoke(arg, fileName);
		} else {// 对象的属性
			String tmp[] = fileName.split("\\.");
			for (int i = 0; i < tmp.length; i++) {
				Method method = arg.getClass().getMethod(getGetterNameByFiledName(tmp[i]));
				arg = method.invoke(arg);
			}
		}
		return arg;
	}

	/**
	 * 根据属性名 得到该属性的getter方法名
	 */
	public String getGetterNameByFiledName(String fieldName) {
		return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
	}

	/**
	 * 根据目标方法和注解类型 得到该目标方法的指定注解
	 */
	public Annotation getAnnotationByMethod(Method method, Class<?> annoClass) {
		Annotation all[] = method.getAnnotations();
		for (Annotation annotation : all) {
			if (annotation.annotationType() == annoClass) {
				return annotation;
			}
		}
		return null;
	}

	/**
	 * 根据类和方法名得到方法
	 */
	public Method getMethodByClassAndName(Class<?> c, String methodName) {
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				return method;
			}
		}
		return null;
	}

	class Retinfo {
		private boolean flag;
		private String msg;

		public boolean isFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Retinfo(boolean status, String msgInfo) {
			flag = status;
			msg = msgInfo;
		}
	}

}
