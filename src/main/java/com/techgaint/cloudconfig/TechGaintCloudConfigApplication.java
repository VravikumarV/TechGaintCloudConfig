package com.techgaint.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TechGaintCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechGaintCloudConfigApplication.class, args);
	}
}
