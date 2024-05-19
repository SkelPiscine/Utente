package com.settannim.esercizio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Esercizio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio2Application.class, args);
	}

}
