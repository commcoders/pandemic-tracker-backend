package com.covid.panchayathapp.service;

import javax.validation.Valid;

import com.covid.panchayathapp.model.HouseModel;

public interface HouseService {
	
	public HouseModel getHouseDetails (Long houseId);

	public void createHouseDetails(@Valid HouseModel houseModel);

}
