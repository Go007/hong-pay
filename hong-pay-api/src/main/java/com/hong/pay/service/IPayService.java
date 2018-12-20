package com.hong.pay.service;

import com.github.pagehelper.PageInfo;
import com.hong.common.bean.GenericResult;
import com.hong.pay.bean.OrderBill;
import com.hong.pay.bean.PayChannel;
import com.hong.pay.bean.Payment;
import com.hong.pay.bean.Refund;
import com.hong.pay.dto.*;
import com.hong.pay.enums.BusinessType;
import com.hong.pay.enums.ChannelType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Map;

/**
* @ClassName: IPayService
* @Description: 支付接口类
*/
public interface IPayService {

    /**
     * 获取支付渠道
     * @param source 来源
     * @return 来源列表
     */
	@RequestMapping(value = "/pay/channellist", method = RequestMethod.GET)
    GenericResult<List<PayChannel>> listPayChannelBySource(@RequestParam("source") String source);

    /**
     * <pre>
     *  <span>参数Map<String, String> param格式如下：</span>
     *  <ul>
     *   <li>channelType：支付渠道类型 {@link ChannelType}</li>
     *   <li>expireTime：订单失效时间yyyyMMddHHmmss；</li>
     *   <li>orderType：订单类型：1商品订单；2其他订单；</li>
     *   <li>orderNo：订单号</li>
     *   <li>orderAmt：订单金额（分）</li>
     *   <li>source：支付来源（Android、IOS、PC、H5、WECHAT等）</li>
     *   <li>bizType：业务类型：还款支付、购物支付{@link BusinessType}}</li>
     *   <li>userId：用户ID</li>
     *   <li>clientIp：客户端IP</li>
     *   <li>remark：备注</li>
     *   <li>extraData：附加数据</li>
     *  </ul>
     * </pre>
     *
     * 支付请求
     * @param params Map<String, String>
     * @return PayResponse
     */
	@RequestMapping(value = "/pay/topay", method = RequestMethod.POST)
    GenericResult<PayApplyResult> pay(@RequestParam Map<String, String> params);

    /**
     * 支付请求
     * @param params
     * @return
     */
    @RequestMapping(value = "/pay/execPay", method = RequestMethod.POST)
    GenericResult<PayApplyResult> execPay(@RequestBody Map<String, String> params);

    /**
     * 支付异步通知处理
     * @param params Map<String, String> 第三方请求通知参数原样拓传
     * @return PayNotifyResponse
     */
	@RequestMapping(value = "/pay/payNotify", method = RequestMethod.POST)
    GenericResult<PayNotifyResult> payNotify(@RequestParam Map<String, String> params);

    /**
     * 支付同步返回
     * @param params Map<String, String> 第三方请求跳转参数原样拓传
     * @return PayReturnResponse
     */
	@RequestMapping(value = "/pay/payReturn", method = RequestMethod.POST)
    GenericResult<PayReturnResult> payReturn(@RequestParam Map<String, String> params);

    /**
     * 退款请求
     *
     * <pre>
     *  <ul>
     *   <li>payId：支付ID</li>
     *   <li>refundType：退款类型：1车票；2保险；</li>
     *   <li>refundNo：退款单号（订单详情或保险订单号）</li>
     *   <li>refundAmt：退款金额</li>
     *   <li>refundRate：退款费率</li>
     *   <li>refundReason：退款原因</li>
     *   <li>remark：备注</li>
     *   <li>extraData：附加数据</li>
     *  </ul>
     * </pre>
     *
     * @param params Map<String, String>
     * @return RefundResponse
     */
	@RequestMapping(value = "/pay/refund", method = RequestMethod.POST)
    GenericResult<RefundApplyResult> refund(@RequestParam Map<String, String> params);

    /**
     * 退款异步通知回调
     * @param params Map<String, String>
     * @return RefundNotifyGenericResult
     */
	@RequestMapping(value = "/pay/refundNotify", method = RequestMethod.POST)
    GenericResult<RefundNotifyResult> refundNotify(@RequestParam Map<String, String> params);

    //-----------------------------------------------------------------------
    /**
     * <pre>
     *  <ul>
     *   <li>PARAM_PAY_ID：支付ID</li>
     *   <li>PARAM_THIRD_TRADE_NO：第三方流水号</li>
     *  </ul>
     * </pre>
     *
     * 支付查询
     * @param params
     * @return
     */
	@RequestMapping(value = "/pay/payQuery", method = RequestMethod.POST)
    GenericResult<PayQueryResult> payQuery(@RequestParam Map<String, String> params);

    /**
     * 支付查询
     *
     * @param params
     * @return
     */
    @RequestMapping(value = "/pay/payQueryStatus", method = RequestMethod.POST)
    GenericResult<PayQueryResult> payQueryStatus(@RequestBody Map<String, String> params);

    /**
     * 获取支付记录
     * @param orderNo 订单号
     * @param status 支付状态
     * @return
     */
    @RequestMapping(value = "/pay/payQueryByOrderNo", method = RequestMethod.POST)
    GenericResult<Payment> payQueryByOrderNo(@RequestParam("orderNo") String orderNo, @RequestParam("status") Integer status);


    /**
     * 根据payId获取支付信息
     * @param payId
     */
    @RequestMapping(value = "/pay/payQueryByPayId", method = RequestMethod.POST)
    GenericResult<Payment> payQueryByPayId(@RequestParam("payId") String payId);

    /**
     * <pre>
     *  <ul>
     *   <li>payId：支付ID</li>
     *  </ul>
     * </pre>
     *
     * 退款查询
     * @param params
     * @return
     */
	@RequestMapping(value = "/pay/refundQuery", method = RequestMethod.POST)
    GenericResult<RefundQueryResult> refundQuery(@RequestParam Map<String, String> params);

    /**
     * 按订单查询账单
     * @param originPayId 支付id
     * @param changePayIds 支付id
     * @return
     */
	@RequestMapping(value = "/pay/orderBill", method = RequestMethod.POST)
    GenericResult<List<OrderBill>> orderBill(@RequestParam("originPayId") String originPayId, @RequestParam("changePayIds") String... changePayIds);

    /**
     * <pre>
     *  <ul>
     *   <li>refundType：退款类型</li>
     *   <li>beginTime：开始时间</li>
     *   <li>endTime：结束时间</li>
     *  </ul>
     * </pre>
     * 查询退款数据
     * @param params
     * @return
     */
	@RequestMapping(value = "/pay/queryRefundsForPage", method = RequestMethod.POST)
    GenericResult<PageInfo<Refund>> queryRefundsForPage(@RequestParam Map<String, ?> params);
}
