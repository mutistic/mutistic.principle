package com.mutistic.creational.signleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @program 单例模式-控制实例的数目
 * @description
 * @author mutisitic
 * @date 2018年8月13日
 */
public class SignletonCache {
	/**
	 * 实例缓存器
	 */
	private final static Map<String, SignletonCache> SIGN_CACHE_MAP = new HashMap<String, SignletonCache>();
	/**
	 * 实例计数器
	 */
	private static int INDEX = 0;
	/**
	 * 最大实例数量
	 */
	private final static int MAX_SIZE = 3;
	private final static String CACHE_KEY = "SIGNLETON";

	/**
	 * 私有化 默认构造函数，不提供其他构造函数
	 */
	private SignletonCache() {
	}

	/**
	 * @description 3、提供单例对象全局访问点- 通过双重检查枷锁的方式实现线程安全
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public static synchronized SignletonCache getIntance() {
		SignletonCache sign = SIGN_CACHE_MAP.get(CACHE_KEY + INDEX);
		if (sign == null) {
			sign = new SignletonCache();
			SIGN_CACHE_MAP.put(CACHE_KEY + INDEX, sign);
		}

		INDEX++;
		if (INDEX > MAX_SIZE) {
			INDEX = 0;
		}

		return sign;
	}

}
