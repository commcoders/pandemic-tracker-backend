package com.covid.panchayathapp.service;

import javax.validation.Valid;

import com.covid.panchayathapp.model.RegistrationDetails;

public interface UserRegistrationService {
  public void registerUser(@Valid RegistrationDetails registrationDetails);
}
