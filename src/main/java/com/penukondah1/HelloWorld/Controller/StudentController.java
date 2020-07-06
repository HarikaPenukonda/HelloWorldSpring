package com.penukondah1.HelloWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penukondah1.HelloWorld.Model.Student;
import com.penukondah1.HelloWorld.Service.StudentService;

@RestController
public class StudentController {
	
	//instance of studentservice - no need to create a new instance every time, Singleton needs the instance that spring created
	//private member variable 
	@Autowired //depencency to student service -- for depency injection 
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		
		return studentService.getAllStudents();
	}	
		/* Spring MVC - when there is /student request it maps getAllStudents method , execute that method and returns 
		 * the object. The returned object is gonna get converted to JSON automatically and send back as HTTP response*/
		
		/*The generated JSON has key names corresponding to property names of the student class. The JSON values are 
		 * values of those properties*/
		
	@RequestMapping("/students/{id}") //{id} to inform spring that it is variable {token}
	public Student getStudent(@PathVariable String id) 
	/*@PathVariable to send the variable {id} as the argument te that respective method
	It maps {id} to String id of the method getStudent*/
	{
		return studentService.getStudent(id);
	}
	

}
