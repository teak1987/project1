package com.java1.java1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java1.java1.model.StatusUpdate;
import com.java1.java1.service.StatusUpdateService;


@Controller
public class PageController {

	@Autowired
	private StatusUpdateService statusUpdateService;
	
//	  @GetMapping("/home") 
//	  public String home() { 
//		  return "app.home"; 
//	}
	
	@GetMapping("/home")
	ModelAndView home(ModelAndView model) {
		StatusUpdate statusUpdate = statusUpdateService.getLatest();
		model.getModel().put("statusUpdate", statusUpdate);
		model.setViewName("app.home");
		return model;
	}
	 
	
	@GetMapping("/about")
	public String about() {
		return "app.about";
	}
	

	
	
	
}
