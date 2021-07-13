package com.covid.panchayathapp.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.covid.panchayathapp.entity.MemberMaster;
import com.covid.panchayathapp.model.MemberMasterModel;

@Component
@Mapper(componentModel="spring")
public interface MemberMasterMapper {
	MemberMasterMapper INSTANCE = Mappers.getMapper(MemberMasterMapper.class);
			
	
	public MemberMaster MemberMasterModelToMemberMaster(MemberMasterModel memberMasterModel);
	
		  
	
	public MemberMasterModel MemberMasterToMemberMasterModel(MemberMaster memberMaster);
	
	public List<MemberMasterModel> memberMasterSetToMemberMasterModelList(List<MemberMaster> memberMasters);
	public List<MemberMaster> memberMasterModelListToMemberMaster(List<MemberMasterModel> memberMasterModels);
	
}
