package com.mutistic.behavioral.interpreter.resolver;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import com.mutistic.utils.PrintUtil;

/**
 * @program NonteminalExpression：非终结符解释器
 * @description 元素作为非终结符对应的解释器，解释并执行中间元素
 * @author mutisitic
 * @date 2018年9月3日
 */
public class ElementExpression extends ReadXmlExpression {

	/**
	 * 用来记录组合的ReadXmlExpression元素
	 */
	private List<ReadXmlExpression> express = new ArrayList<ReadXmlExpression>();
	
	/**
	 * 元素名称
	 */
	private String eleName;
	/**
	 * 构造函数：设置元素名称
	 * @param eleName
	 */
	public ElementExpression(String eleName) {
		super();
		this.eleName = eleName;
	}

	/**
	 * @description 元素非终结符解释器的具体解释操作
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 * @return
	 * @see com.mutistic.behavioral.interpreter.xml.ReadXmlExpression#interpret(com.mutistic.behavioral.interpreter.xml.Context)
	 */
	@Override
	public String[] interpret(Context ctx) {
		// 从Context中取出当前元素作为父级元素，并设置回到上下文中
		List<Element> preEleList = ctx.getPreEleList();
		PrintUtil.two("ElementExpression.interpret()：元素非终结符解释器的开始具体解释操作", preEleList);
		
		// 获取根元素
		if(preEleList == null || preEleList.isEmpty()) {
			Element nowEle = ctx.getDocument().getDocumentElement();
			preEleList.add(nowEle); // 添加至上下文元素集合中
			PrintUtil.three("ElementExpression：获取根元素，添加至上下文元素集合中：", nowEle.getNodeName());
		}
		// 根据父级元素和元素名称获取当前元素，并设置回到上下文中
		else {
			List<Element> nowEle = new ArrayList<Element>();
			for (Element temp : preEleList) {
				nowEle.add(ctx.getNowEle(temp, eleName).get(0));
				PrintUtil.three("ElementExpression：根据父级元素和元素名称获取当前元素，并设置回到上下文中", nowEle.get(0).getNodeName());
				break;
			}
			ctx.setPreEleList(nowEle);
		}
		
		// 循环调用子元素的interpret解释操作
		PrintUtil.three("循环调用子元素的interpret解释操作：", express);
		String[] result = null;
		for (ReadXmlExpression ele : express) {
			result = ele.interpret(ctx);
		}
		return result;
	}
	
	/**
	 * @description 添加元素 
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ele
	 * @return
	 */
	public boolean addEle(ReadXmlExpression ele) {
		express.add(ele);
		return true;
	}
	/**
	 * @description 移除元素 
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ele
	 * @return
	 */
	public boolean removeEle(ReadXmlExpression ele) {
		express.remove(ele);
		return true;
	}
	
}
