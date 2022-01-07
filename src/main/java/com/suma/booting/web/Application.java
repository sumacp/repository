package com.suma.booting.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@GetMapping
	public String Power()
	{
		return "this is my first aplication";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
