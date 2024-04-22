package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Login;

public interface LoginService {
	
	Login SaveLogin(Login login);
	
	//List<Login> SaveAllLogin(Login login);
	
	List<Login> getAllLogin();
	
	Login getLoginById(int id);
	
	Login updateLogin(Login login,int id);
	
	void deleteLogin(int id);
	
	

}
