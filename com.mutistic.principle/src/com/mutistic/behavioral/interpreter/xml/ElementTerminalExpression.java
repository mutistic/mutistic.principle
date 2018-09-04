package com.mutistic.behavioral.interpreter.xml;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.mutistic.utils.PrintUtil;

/**
 * @program TerminalExpression：终结符解释器
 * @description 元素作为终结符对应的解释器
 * @author mutisitic
 * @date 2018年9月4日
 */
public class ElementTerminalExpression extends ReadXmlExpression {

	/**
	 * 元素名称
	 */
	private String eleName;
	/**
	 * 构造函数：设置元素名称
	 * @param eleName
	 */
	public ElementTerminalExpression(String eleName) {
		this.eleName = eleName;
	}
	
	/**
	 * @description 元素终结符解释器的具体解释操作
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 * @return
	 * @see com.mutistic.behavioral.interpreter.xml.ReadXmlExpression#interpret(com.mutistic.behavioral.interpreter.xml.Context)
	 */
	@Override
	public String[] interpret(Context ctx) {
		// 从Context中取出当前元素作为父级元素，并设置回到上下文中
		Element preEle = ctx.getPreEle();
		Element ele = null;
		PrintUtil.two("ElementTerminalExpression.interpret()：元素终结符解释器的开始具体解释操作", preEle);
		
		// 获取根元素
		if(preEle == null) {
			ele = ctx.getDocument().getDocumentElement();
			ctx.setPreEle(ele);
			PrintUtil.three("ElementTerminalExpression：获取根元素", ele.getNodeName());
		}
		// 根据父级元素和元素名称获取当前元素，并设置回到上下文中
		else {
			ele = ctx.getNowEle(preEle, eleName);
			ctx.setPreEle(ele);
			PrintUtil.three("ElementTerminalExpression：根据父级元素和元素名称获取当前元素，并设置回到上下文中", ele.getNodeName());
		}
		
		// 获取具体的元素值
		PrintUtil.three("ElementTerminalExpression：获取具体的元素值", ele.getNodeName());
//		return new String[] {ele.getFirstChild().getNodeValue()};
		NodeList node = ele.getChildNodes();
		String[] result = new String[node.getLength()];
		for (int i = 0; i < node.getLength(); i++) {
			result[i] = node.item(i).getNodeValue();
		}
		return result;
	}

}
