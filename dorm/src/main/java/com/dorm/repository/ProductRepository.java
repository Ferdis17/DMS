package com.dorm.repository;

import java.util.List;

import com.dorm.domain.Product;

public interface ProductRepository {
	
    List<Product> getAllProducts();
    void updateStock(String productId, long noOfUnits);

}
