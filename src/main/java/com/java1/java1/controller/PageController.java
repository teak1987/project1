package com.java1.java1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java1.java1.model.StatusUpdate;
import com.java1.java1.service.StatusUpdateService;


@Controller
public class PageController {

	@Autowired
	private StatusUpdateService statusUpdateService;
	
	  @GetMapping("/home") 
	  public String home() { 
		  return "app.home"; 
	}
	 
	
	@GetMapping("/about")
	public String about() {
		return "app.about";
	}
	
	/*
	 * @GetMapping("/add-status") 
	 * public String addStatus() {
	 *       return "app.addStatus"; }
	 */
	

	@RequestMapping(method=RequestMethod.GET,value = "/add-status" )
	ModelAndView addStatus(ModelAndView model) {
		model.setViewName("app.addStatus");
		StatusUpdate statusUpdate = new StatusUpdate();
		StatusUpdate latestStatusUpdate = statusUpdateService.getLatest();
		model.getModel().put("statusUpdate", statusUpdate);
		model.getModel().put("latestStatusUpdate", latestStatusUpdate);
		return model;
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value = "/add-status" )
	ModelAndView addStatus(ModelAndView model, StatusUpdate statusUpdate) {
		model.setViewName("app.addStatus");
	    statusUpdateService.save(statusUpdate);	    
		StatusUpdate latestStatusUpdate = statusUpdateService.getLatest();
		model.getModel().put("latestStatusUpdate", latestStatusUpdate);
		return model;
	}
	
	
}
