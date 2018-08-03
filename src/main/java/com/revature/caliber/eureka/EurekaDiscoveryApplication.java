package com.revature.caliber.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryApplication {
	
	private String test = "Test";
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaDiscoveryApplication.class, args);
	}
	
	public String getTest() {
		return test;
	}

}
