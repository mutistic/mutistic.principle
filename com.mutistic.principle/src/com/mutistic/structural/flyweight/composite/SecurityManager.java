package com.mutistic.structural.flyweight.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mutistic.utils.PrintUtil;

/**
 * @program 安全管理类，通常实现为单例模式
 * @description
 * @author mutisitic
 * @date 2018年9月3日
 */
public class SecurityManager {
	// 实现为单例
	private static SecurityManager security = new SecurityManager();
	private SecurityManager() { }
	public static SecurityManager getInstance() {
		return security;
	}
 
	/**
	 * 缓存登陆用户实例
	 */
	private Map<String, List<Flyweight>> sessionMap = new HashMap<String, List<Flyweight>>();

	/**
	 * @description 用户登陆方法 
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param user
	 */
	public void login(String user) {
		PrintUtil.two("SecurityManager.login()：用户登陆：", "user="+ user);
		List<Flyweight> userFly = queryByUser(user);
		sessionMap.put(user, userFly);
	}

	/**
	 * @description 判断用户对某个安全是否有权限 
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param user
	 * @param secutiryEntity
	 * @param permit
	 * @return
	 */
	public boolean hasPermit(String user, String secutiryEntity, String permit) {
		List<Flyweight> userFly = sessionMap.get(user);
		if (userFly == null || userFly.isEmpty()) {
			return false;
		}
		for (Flyweight flyweight : userFly) {
			if (flyweight.math(secutiryEntity, permit)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @description 查询用户 
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param user
	 * @return
	 */
	private List<Flyweight> queryByUser(String user) {
		List<Flyweight> userFly = new ArrayList<Flyweight>();

		for (String str : TestDB.dbList) {
			String[] temp = str.split(",");
			if (temp[0].equals(user)) {
				Flyweight fly = null;
				PrintUtil.three("SecurityManager.queryByUser()：根据查询的用于权限数据类型创建享元对象：", "user="+ str);
				// 组合非共享对象
				if (temp[1].contains("操作")) {
					fly = new UnsharedConcreteFlyweight();
					String[] flyMaps = TestDB.dbMap.get(temp[1]);
					for (String flyStr : flyMaps) {
						Flyweight flyFactory = FlyweightFactory.getInstance().getFlyweight(flyStr);
						fly.add(flyFactory);
					}
				} 
				// 叶子共享对象
				else {
					fly = FlyweightFactory.getInstance().getFlyweight(temp[1] + "," + temp[2]);
				}
				PrintUtil.three("创建的享元对象：", fly);
				userFly.add(fly);
			}
		}

		return userFly;
	}
}
