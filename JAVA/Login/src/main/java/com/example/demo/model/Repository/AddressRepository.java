package com.example.demo.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{
	
	

}
