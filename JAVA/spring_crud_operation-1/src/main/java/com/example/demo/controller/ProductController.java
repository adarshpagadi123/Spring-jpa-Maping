package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
	@PutMapping("/updated/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable("id") int id){
		return new ResponseEntity<Product>(productService.updateProduct(product,id),HttpStatus.OK);
    }
	
	@GetMapping(value="/get")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping(value="/getById/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id")int id) {
		return new ResponseEntity<Product>(productService.getProductById(id),HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="/deleteById/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		productService.deleteProduct(id);
		return new ResponseEntity<String>("employee deleted",HttpStatus.OK);	
	}
	
	
	/*
	 * <dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-entitymanager</artifactId>
			<version>5.2.3.Final</version>
		</dependency>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>4.1.4.Final</version>
		</dependency>
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.0</version>
		</dependency>
	 */

}
