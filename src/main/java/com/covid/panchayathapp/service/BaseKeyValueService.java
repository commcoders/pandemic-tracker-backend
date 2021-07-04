package com.covid.panchayathapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.panchayathapp.mapper.KeyValueMapper;
import com.covid.panchayathapp.model.KeyValueModel;
import com.covid.panchayathapp.repository.KeyValueRepository;

@Service
public class BaseKeyValueService implements KeyValueService {
	
	@Autowired
	KeyValueRepository keyValueRepository;
	
	
	@Override
	public List<KeyValueModel> getAllKeyValue() {
		KeyValueMapper mapper=Mappers.getMapper(KeyValueMapper.class);
		// TODO Auto-generated method stub
		 return keyValueRepository.findAll().stream().map(e->mapper.KeyValueToKeyValueModel(e)).collect(Collectors.toList());
	}
	@Override
	public List<KeyValueModel> getKeyValueByCategory(String category) {
		KeyValueMapper mapper=Mappers.getMapper(KeyValueMapper.class);
		// TODO Auto-generated method stub
		  return keyValueRepository.findByCategory(category).stream().map(e->mapper.KeyValueToKeyValueModel(e)).collect(Collectors.toList());
	}
}
