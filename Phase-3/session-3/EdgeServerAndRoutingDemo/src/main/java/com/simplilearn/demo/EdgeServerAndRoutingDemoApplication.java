package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EdgeServerAndRoutingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerAndRoutingDemoApplication.class, args);
	}

}
