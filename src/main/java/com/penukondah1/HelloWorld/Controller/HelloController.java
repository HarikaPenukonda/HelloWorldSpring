package com.penukondah1.HelloWorld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*To make the class a rest controller, It was introduces in Spring 4.0 to simplify the creation of 
	RESTful websevices. It is a annotation that combines @Controller and @ResponseBody - which eliminates to annotate
	every request handling method of the controller class with @RequestBody annotation */

public class HelloController {
	
	@RequestMapping("/hello") /*Takes in a parameter i.e URL that this particular method needs to map to
	Used to map web requests onto specific handler classes and/or handler method can be applied to classes as well as
	methods to. It maps only to GET method by default. To map other HTTP methods we have to use specific annotation  */ 
	public String hello()
	{
		return "Hello! This is my first Spring Project";
		
	}

}
