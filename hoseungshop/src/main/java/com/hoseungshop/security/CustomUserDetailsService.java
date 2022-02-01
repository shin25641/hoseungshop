package com.hoseungshop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.hoseungshop.common.CommonMap;
import com.hoseungshop.model.CustomUserDetails;
import com.hoseungshop.service.UserService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userServive;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		CustomUserDetails user = userServive.findOneUser(new CommonMap()			
				.put("user_id", username));
		
		if(user==null) {
		    throw new InternalAuthenticationServiceException(username);
		}
		
		return user;
	}

}
