package com.avinash.learn.security.customUserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.avinash.learn.security.domain.entities.AutoUser;
import com.avinash.learn.security.domain.repositories.AutoUserRepository;

@Component("customDetailService")
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private AutoUserRepository autoUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return autoUserRepository.findByUsername(username);
		
	}

}
