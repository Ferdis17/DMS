package com.dorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dorm.domain.Building;
import com.dorm.repository.BuildingRepository;

@Service
public class BuildingServiceImpl implements BuildingService{
	
	@Autowired
	BuildingRepository buildingRepository;

	@Override
	public List<Building> listAll() {
		
		return (List<Building>) buildingRepository.findAll();
	}

	@Override
	public void save(Building building) {
		buildingRepository.save(building);
		
	}

	@Override
	public Building findOne(long id) {
		
		return buildingRepository.findOne(id);
	}

}
