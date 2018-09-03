package com.mutistic.structural.flyweight.recycling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program 测试数据
 * @description 
 * @author mutisitic
 * @date 2018年9月3日
 */
public class TestDB {

	public static List<String> dbList = new ArrayList<String>();
	
	public static Map<String, String[]> dbMap = new HashMap<String, String[]>();
	
	static {
		// 模拟添加数据 及 权限
		dbList.add("张三,人员列表,查看");
		dbList.add("李四,人员列表,查看");
		dbList.add("李四,操作薪资数据");
		dbList.add("张三1,人员列表,查看");
		dbList.add("张三2,人员列表,查看");
		dbList.add("张三3,人员列表,查看");
		
		dbMap.put("操作薪资数据", new String[] {"薪资数据,查看", "薪资数据,修改"});
	}
}
