package com.trung.smallshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@SpringBootApplication
public class SmallShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallShopApplication.class, args);
	}
}
