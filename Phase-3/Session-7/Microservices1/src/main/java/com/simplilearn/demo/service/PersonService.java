package com.simplilearn.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.demo.entity.PersonEntity;
import com.simplilearn.demo.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	private RestTemplate restTemplate= new RestTemplate();
	
	public PersonEntity addPerson(PersonEntity person) {
		return personRepo.save(person);
	}
	
	///write this method after implementing microservice 2
	public PersonResponse getPerson(int personId) {
		
	  //microservice integration
	  final String url= "http://localhost:8082/api/hobby/{personId}";
	  
	  Map<String, Integer> map= new HashMap<String, Integer>();
	  map.put("personId", personId);
	  String hobby= restTemplate.getForObject(url, String.class,map);
	  
	  PersonEntity entity=  personRepo.getById(personId);
	  PersonResponse resp= new PersonResponse();
	  resp.setPersonId(entity.getPersonId());
	  resp.setName(entity.getName());
	  resp.setAge(entity.getAge());
	  resp.setHobby(hobby);
	  
	  return resp;
	}

}
