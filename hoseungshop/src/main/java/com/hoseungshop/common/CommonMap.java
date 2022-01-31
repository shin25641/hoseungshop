package com.hoseungshop.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.Getter;

public class CommonMap extends HashMap<String, Object> {
	
	private static final long serialVersionUID = 1L;

	@Getter
	private int page;
	@Getter
	private int size;
	
	public CommonMap(){}

	public CommonMap (String key, Object value) {
		super.put(key, value);
	}
	
	public CommonMap (Map<String, Object> map){
		super.putAll(map);
	}
	/*
	 * Pagiation 처리
	 */
	public CommonMap putPage(int page , int size){
		this.page = page;
		this.size = size;
		super.put("page", page);
		super.put("size", size);
		super.put("offset" , (size * (page - 1)));
		return this;
	}
	
	@Override
	public Object get(Object key) {
		return super.get(key);
	}

	@Override
	public CommonMap put(String key, Object value) {
		super.put(key, value);
		return this;
	}
	
	@Override
	public void putAll(Map<? extends String, ? extends Object> m) {
		super.putAll(m);
	}
	
	public Map<String, Object> toMap(){
		return this;
	}

	/* 현재 맵의 키들을 소문자로 다 바꿔준다. */
	public synchronized void batchLowerCaseKeys() {
		CommonMap map = new CommonMap();
		
		if (this.size() != 0) {
			Set<String> keys = this.keySet();
			keys.stream().forEach(c->{
				map.put(c.toLowerCase(), this.get(c));
			});
			this.clear();
			this.putAll(map);
		}
	}

}