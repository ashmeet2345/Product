package com.example.ProductWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductWebApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ProductWebApplication.class, args);

	}

}
