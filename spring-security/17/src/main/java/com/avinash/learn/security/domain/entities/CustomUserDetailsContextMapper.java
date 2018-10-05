package com.avinash.learn.security.domain.entities;

import java.util.Collection;

import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;
import org.springframework.stereotype.Component;


@Component("contextMapper")
public class CustomUserDetailsContextMapper implements UserDetailsContextMapper {

	@Override
	public UserDetails mapUserFromContext(DirContextOperations ctx, String username,
			Collection<? extends GrantedAuthority> authorities) {
		AutoUser user = new AutoUser();
		user.setFirstName(ctx.getStringAttribute("givenName"));
		user.setLastName(ctx.getStringAttribute("sn"));
		user.setEmail(ctx.getStringAttribute("mail"));
		user.setUsername(username);
		user.setAuthorities(authorities);
		return user;
	}

	@Override
	public void mapUserToContext(UserDetails user, DirContextAdapter ctx) {
		AutoUser autoUser = (AutoUser) user;
		ctx.setAttributeValue("givenName", autoUser.getFirstName());
		ctx.setAttributeValue("sn", autoUser.getLastName());
		ctx.setAttributeValue("mail", autoUser.getEmail());
		ctx.setAttributeValue("password", autoUser.getPassword());
		ctx.setAttributeValue("uid", autoUser.getUsername());

	}

}
