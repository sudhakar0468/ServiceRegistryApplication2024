package com.example.sample.ServiceRegistryApplication2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication2024Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication2024Application.class, args);
	}

}
