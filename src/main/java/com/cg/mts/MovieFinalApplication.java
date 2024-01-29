package com.cg.mts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@EnableSwagger2
@SpringBootApplication
@ComponentScan("com.cg")
public class MovieFinalApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(MovieFinalApplication.class, args);
//	}
public static void main(String[] args) {
	SpringApplication.run(MovieFinalApplication.class, args);
}


	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("fseo1  Microservices").description("fseoq"));
	}

}
