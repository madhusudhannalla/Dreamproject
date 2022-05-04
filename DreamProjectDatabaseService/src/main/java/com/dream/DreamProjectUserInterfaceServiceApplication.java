package com.dream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DreamProjectUserInterfaceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamProjectUserInterfaceServiceApplication.class, args);
		
		
		
	}

}
