package com.encora.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentGatwayApplication.class, args);
	}

}
