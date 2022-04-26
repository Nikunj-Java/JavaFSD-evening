package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.HobbyEntity;

@Repository
public interface HobbyRepo extends JpaRepository<HobbyEntity, Integer> {

	
	@Query("select h.hobby from HobbyEntity h where h.personId=:personId")
	public String findByPersonId(int personId);
	
}
