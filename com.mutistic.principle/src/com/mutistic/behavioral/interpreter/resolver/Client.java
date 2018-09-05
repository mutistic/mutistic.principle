package com.mutistic.behavioral.interpreter.resolver;

import java.util.Arrays;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 自定义解析器
 * @author mutisitic
 * @date 2018年9月4日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("自定义解析器");
		String fileName = "src/com/mutistic/behavioral/interpreter/xml/interprete_test.xml";
		
		Context ctx = new Context(fileName);
		showElement(ctx);
		showProperty(ctx);
		showElementList(ctx);
		showPropertyList(ctx);
	}

	/**
	 * @description 演示元素终结符解释器
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 */
	private static void showElement(Context ctx) {
		PrintUtil.one("演示元素终结符解释器：每次获取元素需要重新初始化上下文Context.resetInit()");
		ctx.resetInit();
		
		String name = "c";
		String exrp = "root/a/b/"+name;
		PrintUtil.three("获取"+ name +"元素的值：约定表达式值：", exrp);
		
		ReadXmlExpression root = Resolver.resolver(exrp);
		PrintUtil.three("获取"+ name +"元素的值", Arrays.asList(root.interpret(ctx)));
	}
	
	/**
	 * @description 演示属性终结解释器 
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 */
	private static void showProperty(Context ctx) {
		// 每次重新获取需要重置上下文的：PreEle
		PrintUtil.one("演示属性终结符解释器：每次获取元素需要重新初始化上下文Context.resetInit()");
		ctx.resetInit();
		
		String name = "c";
		String propName = "name";
		String exrp = "root/a/b/"+ name +"."+propName;
		PrintUtil.three("获取"+ name +"元素的值：约定表达式值：", exrp);
		
		ReadXmlExpression root = Resolver.resolver(exrp);
		PrintUtil.three("获取"+ name +"元素的"+ propName +"属性值", Arrays.asList(root.interpret(ctx)));
	}
	
	/**
	 * @description 演示多个元素终结解释器
	 * @author mutisitic
	 * @date 2018年9月5日
	 * @param ctx
	 */
	private static void showElementList(Context ctx) {
		PrintUtil.one("演示元素终结符解释器：每次获取元素需要重新初始化上下文Context.resetInit()");
		ctx.resetInit();
		
		String name = "d";
		String exrp =  "root/a/b/"+ name +"$";
		PrintUtil.three("获取"+ name +"元素的值：约定表达式值：", exrp);
		
		ReadXmlExpression root = Resolver.resolver(exrp);
		PrintUtil.three("获取多个"+ name +"元素的值", Arrays.asList(root.interpret(ctx)));
	}
	
	/**
	 * @description 演示多个属性终结解释器
	 * @author mutisitic
	 * @date 2018年9月5日
	 * @param ctx
	 */
	private static void showPropertyList(Context ctx) {
		PrintUtil.one("演示元素终结符解释器：每次获取元素需要重新初始化上下文Context.resetInit()");
		ctx.resetInit();
		
		String name = "d";
		String propName = "id";
		String exrp =  "root/a/b/"+ name +"$."+ propName +"$";
		PrintUtil.three("获取"+ name +"元素的值：约定表达式值：", exrp);
		
		ReadXmlExpression root = Resolver.resolver(exrp);
		PrintUtil.three("获取多个"+ name +"元素的值多个"+ propName +"属性值", Arrays.asList(root.interpret(ctx)));
	}
}
