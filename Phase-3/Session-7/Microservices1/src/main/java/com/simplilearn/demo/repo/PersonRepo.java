package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.PersonEntity;

@Repository
public interface PersonRepo extends JpaRepository<PersonEntity, Integer> {

}
