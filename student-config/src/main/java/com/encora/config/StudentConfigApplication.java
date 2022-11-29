package com.encora.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class StudentConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentConfigApplication.class, args);
	}

}
