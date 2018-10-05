package com.avinash.learn.security.customauthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.avinash.learn.security.domain.entities.AutoUser;
import com.avinash.learn.security.domain.repositories.AutoUserRepository;

@Component("customAuthenticationProvider")
public class CustomAutneticationProvider implements AuthenticationProvider {

	@Autowired
	private AutoUserRepository repo;
	
	@Override
	public Authentication authenticate(Authentication arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordAuthenticationToken tone = (UsernamePasswordAuthenticationToken)arg0;
		AutoUser user = repo.findByUsername(tone.getName());
		if(!user.getPassword().equalsIgnoreCase(tone.getCredentials().toString())) {
			throw new BadCredentialsException("bad credential");
		}
		return new UsernamePasswordAuthenticationToken(user,user.getPassword(), user.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return UsernamePasswordAuthenticationToken.class.equals(arg0);
	}

}
