package com.example.Bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public class BootdemoApplication {

	public static void main(String[] args) {


		SpringApplication.run(BootdemoApplication.class, args);
	}

}
