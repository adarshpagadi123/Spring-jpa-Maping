package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	@Override
	public void deleteProduct(int id) {
		productRepository.findById(id).orElse(null);
		productRepository.deleteById(id);	
	}
	
	@Override
	public Product updateProduct(Product product, int id) {
		Product existingProduct = productRepository.findById(id).orElse(product);
		existingProduct.setName(product.getName());
		existingProduct.setEmail(product.getEmail());
		existingProduct.setAddress(product.getAddress());
		productRepository.save(existingProduct);
		return existingProduct;
	}
	

}
