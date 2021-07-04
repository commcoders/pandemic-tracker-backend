package com.covid.panchayathapp.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;

public class PasswordUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generatePassword());

	}
	
	public static String generatePassword() {
		 int length = 10;
		    boolean useLetters = true;
		    boolean useNumbers = true;
		   return RandomStringUtils.random(length, useLetters, useNumbers);
	}

}
