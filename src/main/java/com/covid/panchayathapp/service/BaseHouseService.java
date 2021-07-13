package com.covid.panchayathapp.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.panchayathapp.entity.House;
import com.covid.panchayathapp.mapper.HouseMapper;
import com.covid.panchayathapp.model.HouseModel;
import com.covid.panchayathapp.repository.HouseRepository;
@Service
public class BaseHouseService implements HouseService {
	
	@Autowired
   HouseRepository houseRepository;
	
	
	@Override
	public HouseModel getHouseDetails(Long houseId) {
		// TODO Auto-generated method stub
		House house=houseRepository.getById(houseId);
		HouseModel houseModel =  
				HouseMapper.INSTANCE.HouseToHouseModel(house);
		return houseModel;
	}


	@Override
	public void createHouseDetails(@Valid HouseModel houseModel) {
		House house =  
				HouseMapper.INSTANCE.HouseModelToHouse(houseModel);
		houseRepository.save(house);
		// TODO Auto-generated method stub
		
	}

}
