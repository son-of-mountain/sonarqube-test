package com.example.applicationsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationSimpleApplication {

	public static void main(String[] args) {
		ApplicationSimpleApplication.run(ApplicationSimpleApplication.class, args);
	}

	public static String greet(String name) {
		if (name == null || name.isEmpty()) {
			return "Hello, World!";
		}
		return "Hello, " + name + "!";
	}
}
