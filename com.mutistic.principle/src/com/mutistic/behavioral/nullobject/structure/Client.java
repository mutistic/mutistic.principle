package com.mutistic.behavioral.nullobject.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 空对象模式客户端，使用协作者完成具体的功能
 * @author mutisitic
 * @date 2018年9月12日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("空对象模式[Null Object Pattern]");
		
		AbstractObject o1 = ObjectFactory.createrFacoty("AAA"); 
		PrintUtil.three("获取AAA对象的name：", o1.getName());
		
		AbstractObject o2 = ObjectFactory.createrFacoty("BBB"); 
		PrintUtil.three("获取BBB对象的name：", o2.getName());
		
		AbstractObject o3 = ObjectFactory.createrFacoty("CCC"); 
		PrintUtil.three("获取CCC对象的name：", o3.getName());
		
		AbstractObject o4 = ObjectFactory.createrFacoty("DDD"); 
		PrintUtil.three("获取DDD对象的name：", o4.getName());
	}
}
