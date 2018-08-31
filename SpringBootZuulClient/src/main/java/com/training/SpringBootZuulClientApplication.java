package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootZuulClientApplication {
	
	@RequestMapping(value = "/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name="name") String name){
		return "hello <strong style=\"color:red;\">" + name + " </strong> Responsed ";
	}
	
	@RequestMapping(value = "/getStudentDetails/{name}")
	public String getStudentDetials(@PathVariable(name="name") String name){
		return "Hi , my name " + name +"";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulClientApplication.class, args);
	}
}
