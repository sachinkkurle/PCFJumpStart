package com.avinash.learn.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = super.obtainUsername(request);
		String password = super.obtainPassword(request);
		String make = request.getParameter("make");
		
		CustomAuthenticationToken token = new CustomAuthenticationToken(username,password,make);
		super.setDetails(request, token);
		return this.getAuthenticationManager().authenticate(token);
	}

}
