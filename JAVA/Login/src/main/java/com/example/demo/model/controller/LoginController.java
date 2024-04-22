package com.example.demo.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.model.Repository.LoginRepository;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	@Autowired
	LoginRepository loginRepository;
	
	@PostMapping("/savelogin")
	public ResponseEntity<Login> SaveLogin(@RequestBody Login login){
		return new ResponseEntity<Login>(loginservice.SaveLogin(login),HttpStatus.CREATED);
	}
	/* @PostMapping("/entities")
	    public ResponseEntity<List<Login>> saveAllEntities(@RequestBody List<Login> login) {
	        List<Login> savedEntities = loginRepository.saveAll(login);
	        return new ResponseEntity<>(savedEntities, HttpStatus.OK);
	    }
	@PostMapping("/saveloginall")
	public ResponseEntity<String> SaveLogin(@RequestBody List<Login> login){
		loginRepository.saveAll(login);
		return ResponseEntity.ok("datasaved");
	}*/

	
	
	@GetMapping("/getlogin")
	public List<Login> getAllLogin(){
		 return loginservice.getAllLogin();
	}
	@GetMapping("/getlogin/{id}")
	public ResponseEntity<Login> getLoginById(@PathVariable("id") int id){
		return new ResponseEntity<Login>(loginservice.getLoginById(id),HttpStatus.OK);
	}
	
	@PutMapping("/updatelogin")
	public ResponseEntity<Login> updateLogin(@RequestBody Login login,@PathVariable("id")int id) {
		return new ResponseEntity<Login>(loginservice.updateLogin(login, id),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletelogin/{id}")
	public ResponseEntity<String> deleteLogin(@PathVariable("id") int id){
		loginservice.deleteLogin(id);
		return new ResponseEntity<String>(("login id deleted"),HttpStatus.OK);
	}

}
