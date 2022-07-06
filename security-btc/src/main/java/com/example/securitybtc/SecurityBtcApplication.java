package com.example.securitybtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecurityBtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityBtcApplication.class, args);
	}

}
