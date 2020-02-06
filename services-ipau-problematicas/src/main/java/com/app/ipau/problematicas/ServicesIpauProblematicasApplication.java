package com.app.ipau.problematicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.app.ipau.commons.problematicas.models.entities"})
public class ServicesIpauProblematicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesIpauProblematicasApplication.class, args);
	}

}
