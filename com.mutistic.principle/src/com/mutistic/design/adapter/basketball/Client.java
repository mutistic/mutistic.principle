package com.mutistic.design.adapter.basketball;

/**
 * @program 打篮球 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Client {
	public static void main(String[] args) {
		Player pa = new Forwards("AAA");
		pa.attack();
		
		Player pc = new Center("CCC");
		pc.attack();
		
		Player pg = new Gurads("GGG");
		pg.defense();
		
		Player pt = new Translate("我是谁");
		pt.attack();
		pt.defense();
		
	}
}
