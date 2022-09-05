package com.example.microservices.branch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages="com.example.microservices.branch")
public class BranchserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BranchserviceApplication.class, args);
	}

}
