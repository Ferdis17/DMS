package com.dorm.service;

import java.util.List;

import com.dorm.domain.Product;

public interface ProductService {
	
	void updateAllStock();
	List <Product> getAllProducts();

}
