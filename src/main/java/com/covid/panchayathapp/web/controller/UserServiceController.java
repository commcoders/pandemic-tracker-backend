package com.covid.panchayathapp.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.covid.panchayathapp.api.UserApi;
import com.covid.panchayathapp.model.RegistrationDetails;
import com.covid.panchayathapp.service.UserRegistrationService;
@Controller
public class UserServiceController implements UserApi {
	
	@Autowired
	UserRegistrationService userRegistrationService;

	

	@Override
	public ResponseEntity<Void> registerUser(@Valid RegistrationDetails registrationDetails) {
		userRegistrationService.registerUser(registrationDetails);
		// TODO Auto-generated method stub
		return new ResponseEntity<>( HttpStatus.OK);
	}

}
