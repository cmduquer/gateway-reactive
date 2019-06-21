package com.reactive.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayReactiveApplication.class, args);
	}

}
