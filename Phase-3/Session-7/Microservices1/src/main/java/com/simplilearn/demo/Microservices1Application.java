package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class Microservices1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices1Application.class, args);
	}

}
