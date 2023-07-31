package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl serviceImpl;
	
	@GetMapping("getemployee")
	public String getEmployeedetails() {
		return "Hello World !";	
	}
	
}
