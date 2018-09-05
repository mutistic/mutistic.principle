package com.mutistic.behavioral.interpreter.xml;

import java.util.Arrays;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 解析XML-单元素
 * @author mutisitic
 * @date 2018年9月4日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("解析XML-单元素");
		String fileName = "src/com/mutistic/behavioral/interpreter/xml/interprete_test.xml";
		
		Context ctx = new Context(fileName);
		showElement(ctx);
		showProperty(ctx);
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
		
		PrintUtil.three("获取D元素的值：约定表达式值：", "root/a/b/d");
		//创建语法解析器对象
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementTerminalExpression dEle = new ElementTerminalExpression("d");
		
		// 组合语法树：root/a/b/d
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(dEle);
		
		PrintUtil.three("获取D元素的值", Arrays.asList(root.interpret(ctx)));
	}
	
	/**
	 * @description 演示属性终结解释器 
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 */
	private static void showProperty(Context ctx) {
		// 每次重新获取需要重置上下文的：PreEle
		PrintUtil.one("演示属性终结解释器：每次获取元素需要重新初始化上下文Context.resetInit()");
		ctx.resetInit();
		
		PrintUtil.three("获取D元素的值：约定表达式值：", "root/a/b/c.name");
		//创建语法解析器对象
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementExpression cEle = new ElementExpression("c");
		PropertyTerminalExpression nameProp = new PropertyTerminalExpression("name");
		
		// 组合语法树：root/a/b/c.name
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(cEle);
		cEle.addEle(nameProp);
		
		PrintUtil.three("获取C元素的name属性值", Arrays.asList(root.interpret(ctx)));
	}
	
}
