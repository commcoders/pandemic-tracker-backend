package com.covid.panchayathapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.panchayathapp.entity.Member;
import com.covid.panchayathapp.mapper.MemberMapper;
import com.covid.panchayathapp.model.MemberModel;
import com.covid.panchayathapp.repository.MemberRepository;
@Service
public class BaseMemberService implements MemberService {
	
	@Autowired
    MemberRepository memberRepository;
	
	@Override
	public MemberModel getMember(Long memberId) {
		// TODO Auto-generated method stub
		
		Member member=memberRepository.getById(memberId);
		MemberModel memberModel =  
				MemberMapper.INSTANCE.MemberToMemberModel(member);
		return memberModel;
	}

}
