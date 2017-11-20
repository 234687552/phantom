package com.kingboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/20 上午1:00
 * @desc  消费服务.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class PhantomServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhantomServiceConsumerApplication.class, args);
    }
}
