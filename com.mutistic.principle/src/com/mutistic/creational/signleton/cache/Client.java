package com.mutistic.creational.signleton.cache;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Client {
	
	public static void main(String[] args) {
		PrintUtil.one("测试单例模式-控制实例的数目");
		for (int i = 0; i < 7; i++) {
			PrintUtil.three("获取Signleton实例："+i, SignletonCache.getIntance());
		}
	}
}
