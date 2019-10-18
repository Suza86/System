package com.infosistem.infosistem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 
@SpringBootApplication
public class InfosistemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfosistemApplication.class, args);
	}

}
