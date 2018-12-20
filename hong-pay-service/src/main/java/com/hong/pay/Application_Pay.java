package com.hong.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties  // 开启对@ConfigurationProperties的支持
public class Application_Pay
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application_Pay.class, args);
    }
}
