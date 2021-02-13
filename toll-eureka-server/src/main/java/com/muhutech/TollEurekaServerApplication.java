package com.muhutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TollEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollEurekaServerApplication.class, args);
	}

}
