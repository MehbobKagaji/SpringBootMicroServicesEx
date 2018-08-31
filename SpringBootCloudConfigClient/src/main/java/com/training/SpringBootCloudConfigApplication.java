package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudConfigApplication.class, args);
	}
}

/*@RestController
class MessagRestController { 
	
	@Value("${msg}")
	public String msg;
	
	@RequestMapping("/msg")
	public String getMsg(){
		return this.msg;
	}
}*/