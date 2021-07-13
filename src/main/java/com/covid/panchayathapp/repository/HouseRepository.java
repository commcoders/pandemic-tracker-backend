package com.covid.panchayathapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.panchayathapp.entity.House;
@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}
