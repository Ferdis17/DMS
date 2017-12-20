package com.dorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dorm.domain.Application;
import com.dorm.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	ApplicationRepository applicationRepository;

	@Override
	public List<Application> listAll() {
		
		return (List<Application>) applicationRepository.findAll();
	}

	@Override
	public void save(Application application) {
		
		applicationRepository.save(application);
	}

	@Override
	public void Delete(Application application) {
		applicationRepository.delete(application);
		
	}
	
	
	
	

}
