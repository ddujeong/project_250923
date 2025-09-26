package com.ddu.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ddu.project.entity.Member;
import com.ddu.project.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public Member signUp(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		member.setRole("USER");
		return memberRepository.save(member);
		
	}
	public Optional<Member> findByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

}
