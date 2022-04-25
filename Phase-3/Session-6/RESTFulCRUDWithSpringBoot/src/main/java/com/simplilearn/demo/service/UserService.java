package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//add user method
	public User addUser(User u) {
		return repo.save(u);
	}
	
	// List user method
	public List<User> getAllUser(){
		return repo.findAll();
	}
	
	
	//get user by ID
	public User getUserById(int id) {
		
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return null;
		
	}
	
	//update user by id
	public User updateUser(int id, User newUser) {
		if(repo.findById(id).isPresent()) {
			User oldUser= repo.findById(id).get();
			oldUser.setName(newUser.getName());
			oldUser.setEmail(newUser.getEmail());
			oldUser.setCountry(newUser.getCountry());
			
			return repo.save(oldUser);
			
			 
		}
		else {
			return null;
		}
		
	}
	
	// delete user by id - you need to implement
	
	public boolean deleteUser(int id) {
		
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}
	


}
