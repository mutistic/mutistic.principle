package com.mutistic.behavioral.interpreter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 客户端，指的是使用解释器的客户端，通常在这里去把按照语言的语法做的表达式，
 * 转换成为解释器对象捐述的抽象浯法树，这一步也叫解析器，然后调用解释操作。
 * @author mutisitic
 * @date 2018年9月3日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("解释器模式[Interpreter Pattern]-结构");
		
		NonteminalExpression root = new NonteminalExpression();
		NonteminalExpression note = new NonteminalExpression();
		TerminalExpression term = new TerminalExpression();
		root.add(note);
		note.add(term);
		
		Context ctx = new Context();
		root.interpret(ctx);
	}
}
