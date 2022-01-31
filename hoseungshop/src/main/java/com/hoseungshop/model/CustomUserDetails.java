package com.hoseungshop.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class CustomUserDetails implements UserDetails{
	private String USER_ID;
	private String USER_PW;
	private String USER_NAME;
	private String USER_ADDRESS;
	private String USER_POST;
	private String USER_PHONE;
	private String USER_BIRTH;
	private String USER_AGREE;
	private int USER_BUY;
	private int USER_LEVEL;
	private String USER_DELETE;
	private String AUTH;
	private boolean isEnabled;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
	    auth.add(new SimpleGrantedAuthority(AUTH));
		return auth;
	}
	@Override
	public String getPassword() {
		return USER_PW;
	}
	@Override
	public String getUsername() {
		return USER_ID;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		return isEnabled;
	}
	
	
}
