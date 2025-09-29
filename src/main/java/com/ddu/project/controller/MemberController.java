package com.ddu.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddu.project.entity.Member;
import com.ddu.project.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	SecurityFilterChain filterChain;
	
	@GetMapping(value = "/signUp")
	public String signUp() {
		return "signUp";
	}
	@PostMapping("/signUp")
	public String signUpOk(Member member, BindingResult bindingResult) {
		
		return "redirect:/member/login";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/reservation")
	public String reserve() {
		return "reservation";
	}
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
}
