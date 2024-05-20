package com.example.demoSpringDocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	
	@GetMapping("")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Demo";
	}
	
	@GetMapping("hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("hi")
	public String hi() {
		return "Hi";
	}
}
