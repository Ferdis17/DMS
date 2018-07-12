package com.dorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dorm.domain.Customer;
import com.dorm.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customers")
	public String allCustomers(Model model){
		
		model.addAttribute("customer", customerService.getAllCustomers());
		
		return "customers";
		
	}

}
