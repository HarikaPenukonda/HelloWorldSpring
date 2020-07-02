package com.penukondah1.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // used for creating Restful Controllers
public class AppConfiguration {
	
	@RequestMapping("/hello") // to insert the URL
	public String hello()
	{
		return "Hello! This is my first Spring Project";
		
	}

}
