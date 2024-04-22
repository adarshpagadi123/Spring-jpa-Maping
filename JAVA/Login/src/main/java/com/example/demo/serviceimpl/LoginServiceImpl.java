package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.Repository.LoginRepository;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginrepository;

	@Override
	public Login SaveLogin(Login login) {
		return loginrepository.save(login);
	}

	@Override
	public List<Login> getAllLogin() {
		return loginrepository.findAll();
	}

	@Override
	public Login getLoginById(int id) {
		return loginrepository.findById(id).orElse(null);
	}

	@Override
	public Login updateLogin(Login login, int id) {
		Login ExistingLogin = loginrepository.findById(id).orElse(login);
		ExistingLogin.setEmail(login.getEmail());
		ExistingLogin.setName(login.getName());
		loginrepository.save(ExistingLogin);
		return ExistingLogin;
	}

	@Override
	public void deleteLogin(int id) {
		loginrepository.findById(id).orElse(null);
		loginrepository.deleteById(id);
	}

}
