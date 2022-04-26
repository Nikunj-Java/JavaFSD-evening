package com.simplilearn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HobbyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",nullable = false,updatable = false)
	private int id;
	private int personId;
	private String hobby;
	
	public HobbyEntity() {
		
	}
	
	public HobbyEntity(int id, int personId, String hobby) {
		this.id = id;
		this.personId = personId;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
