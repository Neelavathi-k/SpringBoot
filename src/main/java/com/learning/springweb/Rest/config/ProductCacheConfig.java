package com.learning.springweb.Rest.config;

import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@Configuration
public class ProductCacheConfig {

	public Config config() {
		return new Config()
				.setInstanceName("cacheInstance")
				.addMapConfig(new MapConfig()
						.setName("cache")
						.setTimeToLiveSeconds(3000));

	}
}
