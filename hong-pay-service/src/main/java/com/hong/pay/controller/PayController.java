package com.hong.pay.controller;

import com.hong.common.bean.Result;
import com.hong.common.log.LogAnnotation;
import com.hong.common.utils.GetPropertyUtils;
import com.hong.common.validate.ValidateFiled;
import com.hong.common.validate.ValidateGroup;
import com.hong.pay.config.AliPayConfig;
import com.hong.pay.config.WechatPayConfig;
import com.hong.pay.config.WechatScanPayConfig;
import com.hong.pay.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.hong.pay.common.Constants.*;

@RestController
@RequestMapping("pay")
public class PayController {

    GetPropertyUtils propertyUtils = new GetPropertyUtils();

    @Autowired
    private IPayService payService;

    @LogAnnotation(desc = "支付请求")
    @ValidateFiled(index = 0, filedName = PARAM_CHANNEL_TYPE, notBlank = true, msg = "支付渠道不能为空")
    @ValidateFiled(index = 0, filedName = PARAM_BIZ_TYPE, notBlank = true, regStr = "^(\\d{1,2})$", msg = "无效的业务类型")
    @ValidateFiled(index = 0, filedName = PARAM_CLIENT_IP, notBlank = true, msg = "客户端ip不能为空", maxLen = 128)
    @ValidateFiled(index = 0, filedName = PARAM_GOODS_BODY, notBlank = true, msg = "商品信息不能为空")
    @ValidateFiled(index = 0, filedName = PARAM_ORDER_NO, notBlank = true, msg = "订单号不能为空")
    @ValidateFiled(index = 0, filedName = PARAM_ORDER_AMT, notBlank = true, regStr = "^\\d{1,}$", msg = "无效的订单金额")
    @ValidateFiled(index = 0, filedName = PARAM_SOURCE, notBlank = true, msg = "来源不能为空")
    @ValidateFiled(index = 0, filedName = PARAM_USER_ID, notBlank = true, msg = "用户id不能为空")
    @ValidateFiled(index = 0, filedName = PARAM_REMARK, notBlank = false, maxLen = 256)
    @ValidateFiled(index = 0, filedName = PARAM_EXTRA_DATA, notBlank = false, maxLen = 512)
    @PostMapping("/test")
    public Result test(@RequestBody Map<String, String> params){
        Result result = new Result();
        Map<String,Object> data = new HashMap<>();
        data.put("gateWay",AliPayConfig.gateWay);
        data.put("payAppId",AliPayConfig.payAppId);
        data.put("notifyUrl",AliPayConfig.notifyUrl);
        data.put("gateWay2", propertyUtils.getLabel("alipay.gateWay"));
        data.put("wxnotifyurl", WechatPayConfig.notifyUrl);
        data.put("wxscanappid", WechatScanPayConfig.appId);
        result.setData(data);
        payService.pay(params);
        return result;
    }
}
