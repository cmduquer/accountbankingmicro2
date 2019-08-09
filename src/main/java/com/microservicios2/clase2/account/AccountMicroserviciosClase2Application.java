package com.microservicios2.clase2.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMicroserviciosClase2Application {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroserviciosClase2Application.class, args);
	}

}
