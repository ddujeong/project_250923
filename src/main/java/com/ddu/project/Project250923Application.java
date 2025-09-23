package com.ddu.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Project250923Application {

	public static void main(String[] args) {
		SpringApplication.run(Project250923Application.class, args);
	}
	@GetMapping("/")
	public String root() {
		return"index";
	}
}
