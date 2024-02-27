package com.ecommercestructure.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceShoppingApplication.class, args);
	}

}
