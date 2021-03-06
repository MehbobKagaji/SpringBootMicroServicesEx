package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageRestController {

	@Value("${msg}")
	private String msg;
	
	@RequestMapping("/msg")
	 String getMsg(){
		return this.msg;
	}
}
