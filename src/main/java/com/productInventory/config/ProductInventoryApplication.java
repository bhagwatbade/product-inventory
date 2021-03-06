package com.productInventory.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Entry point of application
 * 
 * @author bhagwat
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.productInventory")
public class ProductInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInventoryApplication.class, args);
	}

}
