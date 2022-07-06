package com.example.Discovoryservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscovoryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscovoryServicesApplication.class, args);
	}

}
