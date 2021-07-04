package com.covid.panchayathapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.covid.panchayathapp.entity.Member;
import com.covid.panchayathapp.model.MemberModel;

//@Mapper
@Mapper(componentModel="spring")
public interface MemberMapper {
	MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);
public Member MemberModelToMember(MemberModel memberModel);
public MemberModel MemberToMemberModel(Member member);
}
