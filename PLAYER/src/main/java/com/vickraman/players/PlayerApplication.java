package com.vickraman.players;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication

public class PlayerApplication {
	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(PlayerApplication.class, args);
	}

}
