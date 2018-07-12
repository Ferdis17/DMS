package com.dorm.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.dorm.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
    private ProductService productService;
//	@Autowired
//    private ProductRepository productRepository;
//     
        @RequestMapping("/products")
        public String list(Model model) {
//           Product iphone = new Product("P1234","iPhone 6s", new BigDecimal(500));
//           iphone.setDescription("Apple iPhone 6s smartphone with 4.00-inch 640x1136 display and 8-megapixel rearcamera");
//           iphone.setCategory("Smartphone");
//           iphone.setManufacturer("Apple");
//           iphone.setUnitsInStock(1000);
           model.addAttribute("product", productService.getAllProducts());
           return "products";
        }
	        @RequestMapping("/update/stock")
	        public String updateStock(Model model) {
	           productService.updateAllStock();
	           return "redirect:/products";
	        }

}
