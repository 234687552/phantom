package com.kingboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class PhantomServerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhantomServerHystrixApplication.class, args);
	}
}
