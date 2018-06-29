package com.yuqiyu.chapter13.service;

import java.time.chrono.JapaneseChronology;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.SimpleKey;
import org.springframework.stereotype.Service;

import com.yuqiyu.chapter13.entity.UserEntity;
import com.yuqiyu.chapter13.jpa.UserJPA;

@Service
public class UserService {
	@Autowired
	UserJPA jpa;
	
	// 类型为RedisCacheManager
	@Autowired
	CacheManager cacheManager;
	
	
	// 如果方法没有参数，则使用SimpleKey[]作为key
	@Cacheable(value="people")
	public List<UserEntity> list(String name){
		return jpa.findAll();
	}
	
	// 如果有相同key，则跳过方法执行，直接获得结果,SimpleKey [23,abc] = new SimpleKey(23,"abc");
	@Cacheable(value="people")
	public UserEntity findOne(Long id,String name) {
		// 这里可打断点查看cachemanager和cache
		Cache pCache = cacheManager.getCache("people");
		
		return jpa.findOne(id);
	}
	
	// 每次都会执行方法，并将结果存入指定的缓存中
	@CachePut(value="people")
	public UserEntity add(UserEntity userEntity) {		
		UserEntity userEntity2 = jpa.save(userEntity);
		System.out.println("为id、key为:"+userEntity2.getId()+"数据做了缓存");
		return userEntity2;
	}
	
	// 删除，默认策略是用参数值代替，如id=22，则key=22
	@CacheEvict(value="people")
	public void delete(Long id) {
		 System.out.println("删除了id、key为"+id+"的数据缓存");
		// jpa.delete(id);  // 不做数据库处理，数据应该也会变
	}
	
}
