package com.covid.panchayathapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.panchayathapp.entity.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, String> {
	
	Users findByUsername(String username);

}
