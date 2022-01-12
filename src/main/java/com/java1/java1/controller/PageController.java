package com.java1.java1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

	
	  @GetMapping("/home") 
	  public String home() { 
		  return "app.home"; 
	}
	 
	
	@GetMapping("/about")
	public String about() {
		return "app.about";
	}
	
	@GetMapping("/add-status")
	public String addStatus() {
		return "app.addStatus";
	}
	
}
