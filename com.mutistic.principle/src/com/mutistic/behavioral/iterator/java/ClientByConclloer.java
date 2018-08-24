package com.mutistic.behavioral.iterator.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示：java.util.Collection集合类的迭代器
 * @author mutisitic
 * @date 2018年8月24日
 */
public class ClientByConclloer {
	public static void main(String[] args) {
		PrintUtil.one("java.util.Collection集合类的迭代器");
		showList();
		showMap();
	}

	/**
	 * @description List的迭代器
	 * @author mutisitic
	 * @date 2018年8月24日
	 */
	private static void showList() {
		PrintUtil.one("List的迭代器");
		List<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			PrintUtil.three("List.iterator().next()", it.next());
		}
	}
	
	/**
	 * @description Map的迭代器
	 * @author mutisitic
	 * @date 2018年8月24日
	 */
	private static void showMap() {
		PrintUtil.one("Map的迭代器");
		Map<String, String> map = new HashMap<String, String>();
		map.put("111", "AAA");
		map.put("222", "BBB");
		map.put("333", "CCC");
		
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			PrintUtil.three("Entry.getkey() = "+entry.getKey(), " Entry.getValue() = "+entry.getValue());
		}
		
	}
}
