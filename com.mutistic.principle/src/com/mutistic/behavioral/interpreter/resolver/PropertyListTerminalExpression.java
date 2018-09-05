package com.mutistic.behavioral.interpreter.resolver;

import java.util.List;

import org.w3c.dom.Element;

import com.mutistic.utils.PrintUtil;

/**
 * @program TerminalExpression：终结符解释器 
 * @description 多个属性终结符对应的解释器
 * @author mutisitic
 * @date 2018年9月4日
 */
public class PropertyListTerminalExpression extends ReadXmlExpression {

	/**
	 * 属性名
	 */
	private String propName;
	/**
	 * 构造函数：设置属性名
	 * @param propName
	 */
	public PropertyListTerminalExpression(String propName) {
		this.propName = propName;
	}
	
	/**
	 * @description 多个属性终结符对应的解释器的具体解释操作
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 * @return
	 * @see com.mutistic.behavioral.interpreter.xml.ReadXmlExpression#interpret(com.mutistic.behavioral.interpreter.xml.Context)
	 */
	@Override
	public String[] interpret(Context ctx) {
		PrintUtil.two("PropertyTerminalExpression：属性终结符解释器的具体解释操作：获取具体的属性值：", propName);

		List<Element> eles = ctx.getPreEleList();
		String[] result = new String[eles.size()];
		for (int i = 0; i < eles.size(); i++) {
			result[i] = eles.get(i).getAttribute(propName);
		}
		return result;
	}

}
