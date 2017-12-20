package com.dorm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dorm.domain.Building;

@Repository
public interface BuildingRepository extends CrudRepository<Building, Long>{
	
	

}
