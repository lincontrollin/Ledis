package com.lin.project.redis.conf;


/**
 * 配置解析类
 * @author linwanqi
 * @date 2015年11月25日
 *
 */
public interface ConfigParser {
	
	/**
	 * 根据filePath解析出元素
	 * @param filePath
	 */
	void doParse(String filePath,LedisConfig config);

}
