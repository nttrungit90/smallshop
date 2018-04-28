package com.trung.smallshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SmallShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallShopApplication.class, args);
	}
}
