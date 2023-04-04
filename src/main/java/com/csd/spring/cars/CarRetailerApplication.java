package com.csd.spring.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarRetailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRetailerApplication.class, args);
	}

}
