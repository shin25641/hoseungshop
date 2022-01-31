package com.hoseungshop.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.hoseungshop.common.CommonMap;
import com.hoseungshop.model.CustomUserDetails;

@Mapper
public interface UserMapper {
	
	public CustomUserDetails findOneUser(CommonMap map);

}
