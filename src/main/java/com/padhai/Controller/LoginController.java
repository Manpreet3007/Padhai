package com.padhai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.padhai.dto.StudentModel;
import com.padhai.service.StudentSignupService;

@RestController
public class LoginController {
	
	@Autowired
	private StudentSignupService signUpService;
	
	@GetMapping("/login")
	public String login(){
		return "Login Successfull";
	} 
	
	
	@PostMapping("/sign-up")
	public String signUp(@RequestBody StudentModel student){
		long id = signUpService.signup(student);
		return "Successfully Signed Up"+"with Student Id "+ id;
	}
	
	
	
	

}
