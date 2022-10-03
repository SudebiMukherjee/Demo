package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.demo.service.SimpleService;

@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;
	
	@Autowired
	SimpleService simpleService;
	
	
	@GetMapping("/")
	@ResponseBody
	public String homePage() {
		return simpleService.homePage();
	}
}
