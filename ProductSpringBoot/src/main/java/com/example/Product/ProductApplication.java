package com.example.Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ProductApplication.class, args);

		ProductService service=context.getBean(ProductService.class);
		Product product=new Product();
		product.setName("Samsung Galaxy S21");
		product.setType("Mobile");
		product.setPlace("Microwave");
		product.setWarranty(LocalDate.of(2021, Month.AUGUST,21));
		service.addProduct(product);
		System.out.println(service.getAllProducts());

	}

}
