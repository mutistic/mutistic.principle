package com.mutistic.structural.decorator.aop;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示：模拟AOP功能
 * @author mutisitic
 * @date 2018年9月7日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("模拟AOP功能");
		
		GoodsSaleEbi ebi = new LogDecorator(new CheckDecorator(new GoodsSaleEbo()));
		PrintUtil.two("创建业务接口，组合装饰器：", ebi);
		
		// 准备测试商品数据
		SaleModel model = new SaleModel("商品1", 111);
		
		// 调用业务功能
		ebi.sale("AAA", "客户111", model);
		ebi.sale("BBB", "客户111", model);
	}
}
