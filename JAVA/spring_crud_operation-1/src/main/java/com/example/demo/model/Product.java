package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor    
@NoArgsConstructor
@Getter
@Setter
@Table
@Entity
public class Product {
	
	@Id
	private int id;                                                      
	private String name;  
	private String email;  
	private String address;
	
	
	
}
