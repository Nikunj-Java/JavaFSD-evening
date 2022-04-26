package com.simplilearn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.HobbyEntity;
import com.simplilearn.demo.repo.HobbyRepo;

@Service
public class HobbyService {
	
	@Autowired
	private HobbyRepo hobbyRepo;
	
	public HobbyEntity addHobby(HobbyEntity hobby) {
		return hobbyRepo.save(hobby);
	}
	
	public String findByPersonId(int personId) {
		return hobbyRepo.findByPersonId(personId);
	}

}
