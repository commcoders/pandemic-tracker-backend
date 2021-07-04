package com.covid.panchayathapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.covid.panchayathapp.api.MemberApi;
import com.covid.panchayathapp.model.MemberModel;
import com.covid.panchayathapp.service.MemberService;
@Controller
public class MemberServiceController implements MemberApi {
	
	@Autowired
	MemberService memberService;

	@Override
	public ResponseEntity<MemberModel> getMember(Long memberId) {
		// TODO Auto-generated method stub
		
		
		 return new ResponseEntity<>(memberService.getMember(memberId), HttpStatus.OK);
	}

}
