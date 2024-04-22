package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService{
	
	Product saveProduct(Product product);
	
	List<Product> getAllProduct();
	
	Product getProductById(int id);
	
	Product updateProduct(Product product,int id);
	
	void deleteProduct(int id);
}
