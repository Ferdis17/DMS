package com.dorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dorm.domain.Product;
import com.dorm.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public void updateAllStock() {
		List<Product> allProducts = productRepository.getAllProducts();
		for(Product product : allProducts) {
			if(product.getUnitsInStock() < 500)
				productRepository.updateStock(product.getProductId(), product.getUnitsInStock()+1000);
		}
		
	}
	
	@Override
	public List<Product>  getAllProducts(){
		return productRepository.getAllProducts();
	}
	
		
	
		

}
