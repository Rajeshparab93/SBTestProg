package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@GetMapping
	public String sayHello() {
		return "Test Prog.";
	}
	
	@GetMapping("/place")
	public String sayPlace() {
		return "Pune";
	}

}
