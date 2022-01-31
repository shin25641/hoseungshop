package com.hoseungshop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hoseungshop.common.CommonMap;
import com.hoseungshop.model.CustomUserDetails;
import com.hoseungshop.service.UserService;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userServive;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		CustomUserDetails user = userServive.findOneUser(new CommonMap()
				.put("USER_ID", username));
		
		System.out.println("getUsername : " + user.getUsername());
		System.out.println("getPassword : " + user.getPassword());
		System.out.println("getAuthorities : " + user.getAuthorities());
		
		if(user == null) throw new UsernameNotFoundException(username);
		
		return user;
	}

}
