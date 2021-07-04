package com.covid.panchayathapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.covid.panchayathapp.api.KeyValueApi;
import com.covid.panchayathapp.model.KeyValueCollection;
import com.covid.panchayathapp.service.KeyValueService;
@Controller
public class KeyValueServiceController implements KeyValueApi {
	
	@Autowired
	KeyValueService keyValueService;

	@Override
	public ResponseEntity<KeyValueCollection> getAllKeyValue() {
		KeyValueCollection keyValueCollection=new KeyValueCollection();
		keyValueCollection.setKeyValueList(keyValueService.getAllKeyValue());
		// TODO Auto-generated method stub
		return new ResponseEntity<>(keyValueCollection, HttpStatus.OK);
		//return null;
	}

	@Override
	public ResponseEntity<KeyValueCollection> getKeyValueByCategory(String category) {
		KeyValueCollection keyValueCollection=new KeyValueCollection();
		keyValueCollection.setKeyValueList(keyValueService.getKeyValueByCategory(category));
		// TODO Auto-generated method stub
		return new ResponseEntity<>(keyValueCollection, HttpStatus.OK);
	}

	

	

}
