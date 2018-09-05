package com.mutistic.behavioral.interpreter.elements;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import com.mutistic.utils.PrintUtil;

/**
 * @program NonteminalExpression：非终结符解释器
 * @description 多个元素作为非终结符对应的解释器
 * @author mutisitic
 * @date 2018年9月4日
 */
public class ElementListExpression extends ReadXmlExpression {

	/** 用来记录组合的ReadXmlExpression元素 */
	private List<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
	
	/** 元素名称 */
	private String eleName;
	/**
	 * 构造函数：设置元素名称
	 * @param eleName
	 */
	public ElementListExpression(String eleName) {
		this.eleName = eleName;
	}
	
	/**
	 * @description 多个元素非终结符解释器的具体解释操作
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 * @return
	 * @see com.mutistic.behavioral.interpreter.xml.ReadXmlExpression#interpret(com.mutistic.behavioral.interpreter.xml.Context)
	 */
	@Override
	public String[] interpret(Context ctx) {
		// 从Context中取出当前元素作为父级元素，并设置回到上下文中
		List<Element> preEle = ctx.getPreEleList();
		PrintUtil.two("ElementListExpression.interpret()：多个元素非终结符解释器的开始具体解释操作", preEle);

		List<Element> nowEle = new ArrayList<Element>();
		for (Element element : preEle) {
			nowEle.addAll(ctx.getNowEle(element, eleName));
		}
		PrintUtil.three("ElementListExpression：把当前获取的元素添加至上下文中，获取多个元素", nowEle);
		ctx.setPreEleList(nowEle);
		
		// 循环调用子元素的interpret解释操作
		String[] result = null;
		for (ReadXmlExpression temp : eles) {
			result = temp.interpret(ctx);
		}
		return result;
	}
	
	public boolean addEle(ReadXmlExpression ele) {
		eles.add(ele);
		return true;
	}
	public boolean removeEle(ReadXmlExpression ele) {
		eles.remove(ele);
		return true;
	}

}
