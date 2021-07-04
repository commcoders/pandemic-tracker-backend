package com.covid.panchayathapp.mapper;

import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.covid.panchayathapp.entity.Users;
@Component
public class UserMapper {
	public UserDetails  toUserDetails(Users users) {
            if(users!=null) {
		    return User.withUsername(users.getUsername())
		        .password(users.getPassword())
		        .roles(new String[0])
		        .build();
		  }
            return null;
	}
	
}
