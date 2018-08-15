package com.mutistic.principle.prototype.manager;

import java.util.HashMap;
import java.util.Map;

import com.mutistic.utils.PrintUtil;

/**
 * @program 原型管理器
 * @description
 * @author mutisitic
 * @date 2018年8月15日
 */
public class PrototypeManager {
	/**
	 * 原型管理器：资源管理
	 */
	private final static Map<String, Prototype> map = new HashMap<String, Prototype>();

	/**
	 * 私有化构造函数，声明为单例模式
	 */
	private PrototypeManager() {
		// super();
	}

	/**
	 * @description 添加或修改原型
	 * @author mutisitic
	 * @date 2018年8月15日
	 * @param prototypeId
	 * @param prototype
	 */
	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		if (null != prototypeId && null != prototype) {
			map.put(prototypeId, prototype);
			PrintUtil.printThree("添加或修改原型", "[key = "+ prototypeId +"]" + prototype.toString());
		}
	}

	/**
	 * @description 删除原型
	 * @author mutisitic
	 * @date 2018年8月15日
	 * @param prototypeId
	 * @param prototype
	 */
	public synchronized static void removePrototype(String prototypeId) {
		map.remove(prototypeId);
		PrintUtil.printThree("删除原型", prototypeId);
	}

	public static Prototype getPrototype(String prototypeId) {
		if (map.containsKey(prototypeId)) {
			return map.get(prototypeId);
		}

		PrintUtil.printThree("原型管理器中不存在原型", prototypeId);
		return null;
	}

}
