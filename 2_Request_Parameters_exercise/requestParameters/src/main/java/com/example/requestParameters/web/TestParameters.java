package com.example.requestParameters.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class TestParameters {
	// the endpoint
	@RequestMapping("/hello")
	// configure the @RequestParam name using the name attribute:
	public String hello(@RequestParam(name="name")String name, @RequestParam String location){
		
		return"Welcome to the " + location + " " + name + "!";
	}
}
