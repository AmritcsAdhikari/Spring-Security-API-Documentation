package com.acsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringSecurityAPIDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAPIDocumentationApplication.class, args);
	}

}
