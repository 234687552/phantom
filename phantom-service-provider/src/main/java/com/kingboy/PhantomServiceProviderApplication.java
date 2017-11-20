package com.kingboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/20 上午12:54
 * @desc  生产服务启动类.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PhantomServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhantomServiceProviderApplication.class, args);
    }
}
