package com.avinash.learn.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.avinash.learn.security.domain.entities.AutoUser;

public class CustomAuthenticationToken extends UsernamePasswordAuthenticationToken  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String make;

	public String getMake() {
		return make;
	}

	public CustomAuthenticationToken(String principal, String credentials, String make) {
		super(principal, credentials);
		this.make = make;
	}

	public CustomAuthenticationToken(AutoUser principal, String credentials,
			Collection<? extends GrantedAuthority> authorities,String make) {
		super(principal, credentials, authorities);
		// TODO Auto-generated constructor stub
		this.make = make;

	}

	
	
	
}
