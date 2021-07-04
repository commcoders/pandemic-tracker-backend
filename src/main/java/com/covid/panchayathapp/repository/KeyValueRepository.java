package com.covid.panchayathapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.panchayathapp.entity.KeyValue;
@Repository
public interface KeyValueRepository extends JpaRepository<KeyValue, String> {
	
	List<KeyValue> findByCategory(String category);
		
}
