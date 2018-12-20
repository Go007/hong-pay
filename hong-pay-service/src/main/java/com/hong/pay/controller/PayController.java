package com.hong.pay.controller;

import com.hong.common.bean.Result;
import com.hong.pay.config.AliPayConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pay")
public class PayController {

    @GetMapping("/test")
    public Result test(){
        Result result = new Result();
        Map<String,Object> data = new HashMap<>();
        data.put("gateWay",AliPayConfig.gateWay);
        data.put("payAppId",AliPayConfig.payAppId);
        data.put("notifyUrl",AliPayConfig.notifyUrl);
        result.setData(data);
        return result;
    }
}
