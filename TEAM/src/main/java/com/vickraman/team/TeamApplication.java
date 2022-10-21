package com.vickraman.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication

public class TeamApplication {
	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(TeamApplication.class, args);
	}

}
