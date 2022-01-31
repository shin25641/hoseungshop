package com.hoseungshop.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseungshop.common.CommonMap;
import com.hoseungshop.mapper.UserMapper;
import com.hoseungshop.model.CustomUserDetails;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public CustomUserDetails findOneUser(CommonMap map) {
		return userMapper.findOneUser(map);		
	}

}
