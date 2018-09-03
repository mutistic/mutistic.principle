package com.mutistic.behavioral.interpreter.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * @program 
 * @description 
 * @author mutisitic
 * @date 2018年9月3日
 */
public class ElementExpression extends ReadXmlExpression {

	private List<ReadXmlExpression> express = new ArrayList<ReadXmlExpression>();
	
	@Override
	public String[] interpret(Context ctx) {
		return null;
	}

}
