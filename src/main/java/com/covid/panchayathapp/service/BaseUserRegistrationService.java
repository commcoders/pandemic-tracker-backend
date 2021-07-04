package com.covid.panchayathapp.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.covid.panchayathapp.entity.Users;
import com.covid.panchayathapp.model.RegistrationDetails;
import com.covid.panchayathapp.repository.UserRepository;
import com.covid.panchayathapp.util.EmailServiceImpl;
import com.covid.panchayathapp.util.PasswordUtil;

@Service
public class BaseUserRegistrationService implements UserRegistrationService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	UserRepository userRepository;
	@Autowired
	EmailServiceImpl emailService;
	@Transactional
  public void registerUser(@Valid RegistrationDetails registrationDetails) {
	String  password= PasswordUtil.generatePassword();
	Users user=new Users();
	user.setUsername(registrationDetails.getEmail());
	user.setPassword(passwordEncoder.encode(password));
	userRepository.save(user);
	emailService.sendSimpleMessage(registrationDetails.getEmail(), "Registration", "YOUR USER NAME IS: " +registrationDetails.getEmail()+" and password is: "+password);
	
	
	
  }
}
