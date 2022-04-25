package com.simplilearn.demo;

import java.util.List;

import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	///create new record
	@PostMapping("/")
	public ResponseEntity<User> addUser(@RequestBody User u){
		User user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<User>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<User>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//get all users
	@GetMapping("/")
	public List<User> getAllUser(){
		return service.getAllUser();
	}
	
	// get user by id
	@GetMapping("/{id}")
	public ResponseEntity<User>getUserById(@PathVariable int id){
		User user= service.getUserById(id);
		
		if(user!=null) 
			return new ResponseEntity<User>(user,HttpStatus.FOUND);
		else
			return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
	}
	
	//update user by id
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateUser(@PathVariable int id, @RequestBody User newUser){
		
		User user= service.updateUser(id, newUser);
		if(user!=null)
			return new ResponseEntity<Object>(user,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No  User Available",HttpStatus.NOT_FOUND);
	}
	
	
	///delete by id

}
