package com.avinash.learn.security.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avinash.learn.security.domain.entities.AutoUser;
import com.avinash.learn.security.domain.repositories.AutoUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private AutoUserRepository repo;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute AutoUser user){
		user.setRole("ROLE_USER");
		repo.save(user);
		
		Authentication auth = new UsernamePasswordAuthenticationToken(user, 
				user.getPassword(), user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(auth);
		return "redirect:/";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String goRegister(){
		return "register";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping("/services")
	public String goServices(){
		return "services";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String goLogin(){
		return "login";
	}
	
	@RequestMapping("/schedule")
	public String goSchedule(){
		return "schedule";
	}
}
