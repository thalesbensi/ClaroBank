package com.thalesbensi.ClaroBank;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ClaroBank RESTful API"))
public class ClaroBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaroBankApplication.class, args);
	}

}
