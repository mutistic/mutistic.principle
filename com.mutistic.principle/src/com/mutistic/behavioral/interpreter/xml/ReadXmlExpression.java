package com.mutistic.behavioral.interpreter.xml;

/**
 * @program AbstractExpression：抽象解释器
 * @description 用于处理自定义xml取值表达式的接口
 * @author mutisitic
 * @date 2018年9月3日
 */
public abstract class ReadXmlExpression {

	/**
	 * @description 定义：解释表达式
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param ctx 上下文
	 * @return
	 */
	public abstract String[] interpret(Context ctx);
	
}
