package com.java1.java1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {

	
	  @GetMapping("/home") 
	  public String home() { 
		  return "app.home"; 
	}
	 
	
	@GetMapping("/about")
	public String about() {
		return "app.about";
	}
	
}
