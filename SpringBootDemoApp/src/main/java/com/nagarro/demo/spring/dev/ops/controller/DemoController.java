package com.nagarro.demo.spring.dev.ops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/welcome")
	String getWelcomeMessage() {
		String message="Welcome to Spring Boot Application to demonstrate Jenkins pipeline";
		return message;
	}
}
