package com.mutistic.structural.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @program FlyweightFactory：享元工厂
 * @description 创建享元对象的工程，一般实现为单例模式
 * @author mutisitic
 * @date 2018年9月3日
 */
public class FlyweightFactory {
	// 实现为单例模式
	private static FlyweightFactory factory = new FlyweightFactory();
	private FlyweightFactory() {}
	public static FlyweightFactory getInstance() {
		return factory;
	}
	
	/**
	 * 缓存多个共享享元对象
	 */
	private Map<String, Flyweight> flyMaps = new HashMap<String, Flyweight>();
	
	/**
	 * @description 获取key对应的享元对象 
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param key
	 * @return
	 */
	public Flyweight getFlyweight(String key) {
		Flyweight fly = flyMaps.get(key);
		
		if(fly == null) {
			String[] temp = key.split(",");
			fly = new AuthorizationFlyweight(temp[0], temp[1]);
			flyMaps.put(key, fly);
		}
		
		return fly;
	}
}
