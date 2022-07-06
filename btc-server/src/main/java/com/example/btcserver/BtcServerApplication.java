package com.example.btcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BtcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BtcServerApplication.class, args);
	}

}
