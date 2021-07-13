package com.covid.panchayathapp.mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.covid.panchayathapp.entity.House;
import com.covid.panchayathapp.model.HouseModel;

@Component
@Mapper(componentModel="spring", uses = { MemberMasterMapper.class })
public interface HouseMapper {
	HouseMapper INSTANCE = Mappers.getMapper(HouseMapper.class);
	public House HouseModelToHouse(HouseModel houseModel);
	public HouseModel HouseToHouseModel(House house);
	
	
		
	
	
}
