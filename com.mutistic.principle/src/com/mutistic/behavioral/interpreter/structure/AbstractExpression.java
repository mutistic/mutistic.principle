package com.mutistic.behavioral.interpreter.structure;

/**
 * @program AbstractExpression：抽象表达式
 * @description 定义解释器的接口，约定解释器的解释操作。
 * @author mutisitic
 * @date 2018年9月3日
 */
public abstract class AbstractExpression {

	/**
	 * @description 定义：解释的操作
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param ctx 上下文对象
	 */
	public abstract void interpret(Context ctx);
}
