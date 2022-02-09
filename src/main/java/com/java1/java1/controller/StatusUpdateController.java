package com.java1.java1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java1.java1.model.StatusUpdate;
import com.java1.java1.service.StatusUpdateService;

@Controller
public class StatusUpdateController {

	@Autowired
	private StatusUpdateService statusUpdateService;
	
	@RequestMapping(method=RequestMethod.GET, value="view-status")
	ModelAndView viewStatus(ModelAndView model, @RequestParam(name="p", defaultValue="1") int pageNumber) {
		Page<StatusUpdate> page = statusUpdateService.getPage(pageNumber);
		model.getModel().put("page", page);
		model.setViewName("app.viewStatus");	
		return model;
	}
	
	

	@RequestMapping(method=RequestMethod.GET,value = "/add-status" )
	ModelAndView addStatus(ModelAndView model, @ModelAttribute("statusUpdate") StatusUpdate statusUpdate) {
		model.setViewName("app.addStatus");
		StatusUpdate latestStatusUpdate = statusUpdateService.getLatest();
		model.getModel().put("latestStatusUpdate", latestStatusUpdate);
		return model;
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value = "/add-status" )
	ModelAndView addStatus(ModelAndView model, @Valid StatusUpdate statusUpdate, BindingResult result) {
		model.setViewName("app.addStatus");
		if(!result.hasErrors()) {
			 statusUpdateService.save(statusUpdate);
			 model.getModel().put("statusUpdate", new StatusUpdate());
			 model.setViewName("redirect:/view-status");
		}
	       
		StatusUpdate latestStatusUpdate = statusUpdateService.getLatest();
		model.getModel().put("latestStatusUpdate", latestStatusUpdate);
		return model;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete-status")
	ModelAndView deleteStatus(ModelAndView model,@RequestParam(name="id") Long id) {
		statusUpdateService.delete(id);
		model.setViewName("redirect:/view-status");
		return model;
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/edit-status")
	ModelAndView editStatus(ModelAndView model,@RequestParam(name="id") Long id) {
	    StatusUpdate statusUpdate = statusUpdateService.get(id);
	    model.getModel().put("statusUpdate", statusUpdate);
		model.setViewName("app.editStatus");
		return model;
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit-status")
	ModelAndView editStatus(ModelAndView model,@Valid StatusUpdate statusUpdate, BindingResult result) {
		model.setViewName("app.editStatus");
        if(!result.hasErrors()) {
        	statusUpdateService.save(statusUpdate);
    		model.setViewName("redirect:/view-status");
        }
		return model;
		
	}
	
	
	
}
