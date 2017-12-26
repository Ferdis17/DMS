package com.dorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dorm.domain.Customer;
import com.dorm.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}
	
	

}
