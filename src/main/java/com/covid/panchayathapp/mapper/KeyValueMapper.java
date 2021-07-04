package com.covid.panchayathapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.covid.panchayathapp.entity.KeyValue;
import com.covid.panchayathapp.model.KeyValueModel;

//@Mapper
@Mapper(componentModel="spring")
public interface KeyValueMapper {
	KeyValueMapper INSTANCE = Mappers.getMapper(KeyValueMapper.class);
	
public KeyValue KeyValueModelToKeyValue(KeyValueModel keyValueModel);
public KeyValueModel KeyValueToKeyValueModel(KeyValue keyValue);
}
