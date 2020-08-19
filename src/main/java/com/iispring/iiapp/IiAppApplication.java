package com.iispring.iiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IiAppApplication.class, args);
	}

	@GetMapping("/welcome-page")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "Kush.Official") String name) {
		return String.format("Welocme to 2nd Application %s!", name);
	}
}
