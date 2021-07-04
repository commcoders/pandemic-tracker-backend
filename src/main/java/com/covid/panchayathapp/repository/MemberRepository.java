package com.covid.panchayathapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.panchayathapp.entity.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
