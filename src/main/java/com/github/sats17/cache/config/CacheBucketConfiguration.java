package com.github.sats17.cache.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.sats17.cache.extern.CacheBucket;
import com.github.sats17.cache.internal.services.BucketController;

@Configuration
public class CacheBucketConfiguration {

	@Value("${cachebucket.capacity:100}")
	private int capacity;
	
	@Value("${cachebucket.ttl:-1}")
	private long ttl;
	
	@Bean
	public CacheBucket cacheBucket() {
		if(ttl == -1) {
			return new BucketController(capacity);
		}
		return new BucketController(capacity, ttl);
	}
	
}
