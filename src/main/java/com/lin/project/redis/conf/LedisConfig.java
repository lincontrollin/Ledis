package com.lin.project.redis.conf;

import java.util.List;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisPoolConfig;

public class LedisConfig extends JedisPoolConfig {
	
	public List<HostAndPort> sentinelConfigs;
	
	
	
}
