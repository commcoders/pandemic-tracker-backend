package com.covid.panchayathapp.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.covid.panchayathapp.api.HouseApi;
import com.covid.panchayathapp.model.HouseModel;
import com.covid.panchayathapp.service.HouseService;
@Controller
public class HouseServiceController implements HouseApi {
	
	@Autowired
	HouseService houseService;

	
	@Override
	public ResponseEntity<HouseModel> getHouseDetails(Long houseId) {
		
		return new ResponseEntity<>(houseService.getHouseDetails(houseId), HttpStatus.OK);
		// TODO Auto-generated method stub
		//return houseService.getHouseDetails(houseId);
	}


	@Override
	public ResponseEntity<Void> saveHouse(@Valid HouseModel houseModel) {
		// TODO Auto-generated method stub
	houseService.createHouseDetails(houseModel);
	return new ResponseEntity<>( HttpStatus.OK);
	}

}
