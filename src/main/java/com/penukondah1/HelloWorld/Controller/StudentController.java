package com.penukondah1.HelloWorld.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penukondah1.HelloWorld.Model.Student;

@RestController
public class StudentController {
	
	@RequestMapping("/student")
	public List<Student> getAllStudents()
	{
		/* Using Arrays.asList method to create this list in line and calling the constructor on the student class
		 * to create new student objects*/
		return Arrays.asList(
				new Student(101,"Archie","ECE"),
				new Student(102,"Betty","CSE"),
				new Student(103,"Cheryl","EEE"),
				new Student(104,"Juniper","MECH"),
				new Student(105,"Dagwood","CE"));
		
		/* Spring MVC - when there is /student request it maps getAllStudents method , execute that method and returns 
		 * the object. The returned object is gonna get converted to JSON automatically and send back as HTTP response*/
		
		/*The generated JSON has key names corresponding to property names of the student class. The JSON values are 
		 * values of those properties*/
	}

}
