package com.ddu.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddu.project.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long>{
	
	Optional<Member> findByEmail(String email); 
}
