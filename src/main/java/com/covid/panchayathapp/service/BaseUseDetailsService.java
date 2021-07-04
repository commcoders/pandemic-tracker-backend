package com.covid.panchayathapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.covid.panchayathapp.entity.Users;
import com.covid.panchayathapp.mapper.UserMapper;
import com.covid.panchayathapp.repository.UserRepository;
@Service
public class BaseUseDetailsService implements UserDetailsService {
	  @Autowired
	  private  UserRepository userRepository;
	  @Autowired
	  private  UserMapper userMapper;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		  Users users = userRepository.findByUsername(username);
		    return userMapper.toUserDetails(users);
	}

}
