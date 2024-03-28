package com.nagarro.demo.spring.dev.ops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAppApplication.class, args);
	}

	@GetMapping("/welcome")
	String getWelcomeMessage() {
		String message="Welcome to Spring Boot Application to demonstrate Jenkins pipeline";
		return message;
	}
}
