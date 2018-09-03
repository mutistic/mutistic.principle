package com.mutistic.behavioral.interpreter.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program NonteminalExpression：非终结符表达式
 * 非终结符解释器，用来实现语法规则中非终结符相关的操作，通常一个解释器对应一个语法规则，
 * 可以包含其它的解释器，如果用组合模式来构建抽象语法树的话，相当于组合模式中的组合对象，可以有多种终结符解释器。
 * @description 
 * @author mutisitic
 * @date 2018年9月3日
 */
public class NonteminalExpression extends AbstractExpression {
	
	/** 持有 表达式集合 */
	private List<AbstractExpression> list = new ArrayList<AbstractExpression>();
	
	/**
	 * @description 添加表达式
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param expression
	 */
	public void add(AbstractExpression expression) {
		list.add(expression);
	}
	
	/**
	 * @description 非终结符表达式：解释操作
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param ctx 上下文
	 * @see com.mutistic.behavioral.interpreter.structure.AbstractExpression#interpret(com.mutistic.behavioral.interpreter.structure.Context)
	 */
	@Override
	public void interpret(Context ctx) {
		PrintUtil.two("NonteminalExpression.interpret()", "实现与语法规则中的非终结符相关联的解释操作：递归调用"+ctx);
		for (AbstractExpression abstractExpression : list) {
			abstractExpression.interpret(ctx);
		}
	}

}
