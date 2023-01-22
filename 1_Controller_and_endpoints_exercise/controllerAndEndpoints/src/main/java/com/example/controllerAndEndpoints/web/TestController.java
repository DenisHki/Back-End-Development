package com.example.controllerAndEndpoints.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class TestController {
	// http://localhost:8080/index executes index() method
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	// http://localhost:8080/contact executes contact() method
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
}
