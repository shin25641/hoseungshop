package com.hoseungshop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.hoseungshop.model.CustomUserDetails;

@Service
public class CustomAuthenticationProvider implements AuthenticationProvider{
	
	@Autowired
    private UserDetailsService userDeSer;


	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        
        CustomUserDetails user = (CustomUserDetails) userDeSer.loadUserByUsername(username);
        System.out.println("provider!");
        
        if(!user.isEnabled() || !user.isCredentialsNonExpired()) {
            throw new AuthenticationCredentialsNotFoundException(username);
        }
        
        if(!matchPassword(password, user.getPassword())) {
        	System.out.println("패스워드 불일치!!!");
            throw new BadCredentialsException(username);
        }
 
        if(!user.isEnabled()) {
        	System.out.println("해당 계정 없음!");
            throw new BadCredentialsException(username);
        }
        
        return new UsernamePasswordAuthenticationToken(username, password, user.getAuthorities());


	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
	
	private boolean matchPassword(String loginPwd, String password) {
        return loginPwd.equals(password);
    }



}
