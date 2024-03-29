package com.nagarro.demo.spring.dev.ops.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = DemoController.class)
//below to bypass spring security so that spring doesn't asks us for token
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
public class DemoControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void shouldGetWelcomeMessage() throws Exception {
		ResultActions response = mockMvc.perform(
				get("/welcome")
				.contentType(MediaType.APPLICATION_JSON)
				);
		response.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(
				MockMvcResultMatchers.jsonPath("$",CoreMatchers.is("Welcome to Spring Boot Application to demonstrate Jenkins pipeline")));//"Welcome to Spring Boot Application to demonstrate Jenkins pipeline"));
	}
}
