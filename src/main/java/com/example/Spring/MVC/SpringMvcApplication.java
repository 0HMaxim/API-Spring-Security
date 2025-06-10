package com.example.Spring.MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.Spring.MVC", "config"})
public class SpringMvcApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
}