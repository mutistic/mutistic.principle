package com.mutistic.design.signleton.cache;

import com.mutistic.design.utils.PrintUtil;

/**
 * @program Client客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Client {
	
	public static void main(String[] args) {
		PrintUtil.printOne("测试单例模式-控制实例的数目");
		for (int i = 0; i < 7; i++) {
			PrintUtil.printThree("获取Signleton实例："+i, SignletonCache.getIntance());
		}
	}
}
