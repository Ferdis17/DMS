package com.dorm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dorm.domain.Application;
import com.dorm.service.ApplicationService;

@Controller
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;
	
	@RequestMapping(value="/application", method=RequestMethod.GET)
	public String getApplicationForm(@ModelAttribute("newApplication") Application application) {
		
		return "ApplicationForm";
	}
	
	@RequestMapping(value = "/application", method=RequestMethod.POST)
	public String submitApplication(@Valid @ModelAttribute("newApplication") Application application, BindingResult result, 
			RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors())
			return "ApplicationForm";
		
		applicationService.save(application);
		redirectAttributes.addFlashAttribute(application);
	
	return "redirect:applicationSubmitted";
	}
	
	@RequestMapping(value = "applicationSubmitted", method = RequestMethod.GET)
	public String successPage() {
		return "SuccessApplication";
	}
	
	@RequestMapping(value ="/apllicationList", method = RequestMethod.GET)
    public String applicationDetail(@ModelAttribute("newApplication") Application application, Model model) {
        model.addAttribute("application", applicationService.listAll());
        
        return "ApplicationList";
    }
	

}
