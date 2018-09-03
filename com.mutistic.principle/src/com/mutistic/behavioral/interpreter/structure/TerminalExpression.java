package com.mutistic.behavioral.interpreter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program TerminalExpression：终结符表达式
 * @description 终结符解释器，用来实现语法规则中和终结符相关的操作，不再包含其它的解释器，
 * 如果用组合模式来构建抽象语法树的话，就相当于组合模式中的叶子对象，可以有多种终结符解释器。
 * @author mutisitic
 * @date 2018年9月3日
 */
public class TerminalExpression extends AbstractExpression {

	/**
	 * @description 终结符表达式：解释操作
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param ctx 上下文
	 * @see com.mutistic.behavioral.interpreter.structure.AbstractExpression#interpret(com.mutistic.behavioral.interpreter.structure.Context)
	 */
	@Override
	public void interpret(Context ctx) {
		PrintUtil.two("TerminalExpression.interpret()", "实现与语法规则中的终结符相关联的解释操作"+ ctx);
	}

}
