package com.training;


import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigure {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.training"))
				.paths(regex("/rest.*"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		
		ApiInfo apiinfo = new ApiInfo(
				"Spring Boot Sawgger Ex API",
				"DJJDJDJJD",
				"1.0",
				"terms of Service ",
				new Contact("Mehbob", "https://mehboob.com","mehboob@gmail.com"),
				"Apache License",
				"htps://sdsdd"
				);
		return apiinfo;
		
		}
}