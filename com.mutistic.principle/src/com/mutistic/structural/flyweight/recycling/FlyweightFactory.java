package com.mutistic.structural.flyweight.recycling;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.mutistic.utils.PrintUtil;

/**
 * @program FlyweightFactory：享元工厂
 * @description 启动清除缓存值的线程，实现垃圾回收
 * @author mutisitic
 * @date 2018年9月3日
 */
public class FlyweightFactory {
	// 实现为单例模式
	private static FlyweightFactory factory = new FlyweightFactory();
	private Thread thread;
	private FlyweightFactory() {
		// 启动清除缓存值的线程，实现垃圾回收
		thread = new ClearCahe();
		thread.start();
		PrintUtil.two("FlyweightFactory(): 启动清除缓存值的线程，实现垃圾回收", thread);
	}
	public static FlyweightFactory getInstance() {
		return factory;
	}
	
	/**
	 * 缓存多个共享享元对象
	 */
	private Map<String, Flyweight> flyMaps = new HashMap<String, Flyweight>();
	/**
	 * 实现垃圾回收：用来缓存被共享对象的缓存配置，key和flyMaps中的key一致
	 */
	private Map<String, CacheModel> cacheMap = new HashMap<String, CacheModel>();
	/**
	 * 实现引用计数：用来记录缓存对象被引用的次数，key和flyMaps中的key一致
	 */
	private Map<String, Integer> countMap = new HashMap<String, Integer>();
	/**
	 * 配置缓存保存默认时间：6秒
	 */
	private final long DORABLE_TIME = 6*1000l;
	
	/**
	 * @description 获取某个享元被使用的次数
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param key 享元的key
	 * @return 使用次数
	 */
	public synchronized int gerUseTimes(String key) {
		return !countMap.containsKey(key) ? 0 : countMap.get(key);
	}
	
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
			// 设置享元缓存集合
			String[] temp = key.split(",");
			fly = new AuthorizationFlyweight(temp[0], temp[1]);
			flyMaps.put(key, fly);
			// 设置引用计数
			countMap.put(key, 1);
			// 设置缓存失效配置
			cacheMap.put(key, new CacheModel(System.currentTimeMillis(), DORABLE_TIME, false));
		} else {
			// 设置引用计数
			countMap.put(key, countMap.get(key) + 1);
			// 设置缓存失效配置
			CacheModel cache = cacheMap.get(key);
			cache.setBeginTime(System.currentTimeMillis());
//			cacheMap.put(key, cache);
		}
		
		return fly;
	}
	
	/**
	 * @description 删除key对应享元对象，及与key相关的数据
	 * @author mutisitic
	 * @date 2018年9月3日
	 */
	private synchronized void removeFlyWeight(String key) {
		flyMaps.remove(key);
		cacheMap.remove(key);
		countMap.remove(key);
	}

	/**
	 * @program 维护清除缓存的线程，FlyweightFactory内部使用
	 * @description 
	 * @author mutisitic
	 * @date 2018年9月3日
	 */
	@SuppressWarnings("deprecation")
	private class ClearCahe extends Thread {
		public void run() {
			while(true) {
				// 获取缓存时效的key
				Set<String> removeKey = new HashSet<String>();
				for (String key : cacheMap.keySet()) {
					CacheModel cache = cacheMap.get(key);
					// 缓存时效时间
					if((System.currentTimeMillis() - cache.getBeginTime()) >= cache.getDuralbeTime())  {
						removeKey.add(key);
					}
				}
				// 执行删除缓存key的功能
				for (String key : removeKey) {
					FlyweightFactory.getInstance().removeFlyWeight(key);
				}
				
				PrintUtil.two("ClearCahe.run()：垃圾回收："+ (new Date()), cacheMap.keySet().toString());
				// 线程暂停1s
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(cacheMap.size() == 0) {
					thread.stop();
				}
			}
		}
	}

}
