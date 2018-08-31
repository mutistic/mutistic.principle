package com.mutistic.structural.flyweight.structure;

import java.util.HashMap;
import java.util.Map;

import com.mutistic.utils.PrintUtil;

/**
 * @program FlyweightFactory：
 * @description 享元工厂，主要用来创建并管理共享的相关对象，并对外提供访问共享享元的接口。
 * @author mutisitic
 * @date 2018年8月31日
 */
public class FlyweightFactory {
	/** 缓存多个Flyweight对象 */
	private Map<String, Flyweight> flyMap = new HashMap<String, Flyweight>();

	/**
	 * @description 获取key对应的享元对象 
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param key
	 * @return
	 */
	public Flyweight getFlyweight(String key) {
		Flyweight fly = flyMap.get(key);
		if(fly == null) {
			if(key.contains("Unshared")) {
				UnsharedConcreteFlywelght unshared = new UnsharedConcreteFlywelght();
				unshared.setAllState(key);
				fly = unshared;
			} else {
				fly = new ConcreteFlyweight(key);
			}
			
			flyMap.put(key, fly);
			PrintUtil.three("key="+ key +"对应的享元对象，不存在创建一个享元对象存放在缓存集合中", fly);
		}
		return fly;
	}
}
