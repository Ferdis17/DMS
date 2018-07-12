package com.dorm.service;

import java.util.List;

import com.dorm.domain.Building;



public interface BuildingService {
	
	public List<Building> listAll();
	
	public void save(Building building);
	
	public Building findOne(long id);

}
