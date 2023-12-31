package com.Om.DentalClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Om.DentalClinic.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	 public User findByUsername(String username);
	 
	 public boolean existsByUsername(String username);
	
}
