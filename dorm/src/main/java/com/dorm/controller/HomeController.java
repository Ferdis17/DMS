package com.dorm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value = "/")
public class HomeController {
	
@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Dorm Management System!"); 
		model.addAttribute("tagline", "The one and only amazing dormitories in Fairfield");
		return "welcome";
		
	}

}
