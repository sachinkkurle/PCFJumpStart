package learn.avinash.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import learn.avinash.security.domain.repositories.AutoUserRepository;


@Component("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private AutoUserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repo.findByUsername(username);		
	}

}
