package com.dorm.service;

import java.util.List;

import com.dorm.domain.Application;

public interface ApplicationService {

public List<Application> listAll();
	
	public void save(Application application);
	
	public void Delete(Application application);
}
