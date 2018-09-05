package com.mutistic.behavioral.interpreter.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.mutistic.utils.PrintUtil;

/**
 * @program 自定义解析器
 * @description 根据语法解析表达式，转换成相应的抽象语法树 
 * @author mutisitic
 * @date 2018年9月5日
 */
public class Resolver {
	/** 私有构造函数：避免外部创建该对象实例 */
	private Resolver() { }
	
	/** 非终结解释器：标识符 */
	private final static String PATH = "/";
	/** 属性：标识符 */
	private final static String DOT = ".";
	/** 多个元素或属性：标识符 */
	private final static String LAR = "$";
	/**
	 * 按照分解的向后记录需要解析的元素名称
	 */
	private static List<String> exprList = new ArrayList<String>();
	
	/**
	 * @description 解析传入的表达式
	 * @author mutisitic
	 * @date 2018年9月5日
	 * @param expr 表达式
	 * @return 对应的抽象语法树
	 */
	public static ReadXmlExpression resolver(String expr) {
		// 初始化解析器元素名称集合
		exprList.clear();
		
		// 分解表达式，转换成对应的解析器Mode
		Map<String, ResolverMode> pathMap = resolverPath(expr);
		// 根据节点的属性转换成对应的解释器对象 
		List<ReadXmlExpression> eleList = toInterpreter(pathMap);
		// 组合抽象语法树，按照先后顺序来组合
		ReadXmlExpression role = buildTree(eleList);
		
		return role;
	}

	/**
	 * @description 分解表达式，转换成对应的解析器Mode
	 * @author mutisitic
	 * @date 2018年9月5日
	 * @param expr
	 * @return
	 */
	private static Map<String, ResolverMode> resolverPath(String expr) {
		PrintUtil.three("Resolver.resolverPath()：分解表达式，转换成对应的解析器Mode：expr", expr);
		Map<String, ResolverMode> pathMap = new HashMap<String, ResolverMode>();
		
		// 按照 / 分解表达式
		StringTokenizer path = new StringTokenizer(expr, PATH);
		while (path.hasMoreTokens()) {
			String token = path.nextToken();
			// 存在下一个元素：说明不是属性，不是值：propertyValue = false; end=false
			if(path.hasMoreTokens()) {
				pathMap.put(token, new ResolverMode(token.indexOf(LAR) <= 0, false, false));
				exprList.add(token);
			}
			// 说明是/后最后一个表达式
			else {
				// 说明要获取属性的值，根据 DOT 分解表达式
				int dotIndex = token.indexOf(DOT);
				if(dotIndex > 0) {
					// DOT前为元素非终结解释器：end=false，如果存在 LAR 说明不是单个元素或值：signleValue =false
					String[] temp = token.split("\\"+DOT);
					
					String eleName = temp[0];
					boolean signleValue = true;
					if(eleName.indexOf(LAR) > 0) {
						signleValue = false;
						eleName = eleName.split("\\"+LAR)[0];
					}
					pathMap.put(eleName, new ResolverMode(signleValue, false, false));
					exprList.add(eleName);
					
					// DOT前为属性终结解释器：end=true，如果存在 LAR 说明不是单个元素或值：signleValue =false
					String propName = temp[1];
					signleValue = true;
					if(propName.indexOf(LAR) > 0) {
						signleValue = false;
						propName = propName.split("\\"+LAR)[0];
					}
					pathMap.put(propName, new ResolverMode(temp[1].indexOf(LAR) <= 0, true, true));
					exprList.add(propName);
				} else {
					// 最后一个元素终解释器
					pathMap.put(token, new ResolverMode(token.indexOf(LAR) <= 0, false, true));
					exprList.add(token);
				}
			}
		}
		return pathMap;
	}
	
	/**
	 * @description 根据节点的属性转换成对应的解释器对象 
	 * @author mutisitic
	 * @date 2018年9月5日
	 * @param pathMap
	 * @return
	 */
	private static List<ReadXmlExpression> toInterpreter(Map<String, ResolverMode> pathMap) {
		PrintUtil.three("Resolver.toInterpreter()：根据节点的属性转换成对应的解释器对象：pathMap.keySet()", pathMap.keySet());
		List<ReadXmlExpression> list = new ArrayList<ReadXmlExpression>();
		
		for (String key : exprList) {
			ReadXmlExpression expression = null;
			
			ResolverMode mode = pathMap.get(key);
			// 非终结器
			if(!mode.isEnd()) {
				// signleValue：true：单个值非终结器，false：多个值非终结器
				expression = mode.isSignleValue() ? new ElementExpression(key) :
					new ElementListExpression(key);
			} 
			// 终结器
			else {
				if(mode.isPropertyValue()) {
					// signleValue：true：单个属性终结器，false：多个属性终结器
					expression = mode.isSignleValue() ? new PropertyTerminalExpression(key) :
						new PropertyListTerminalExpression(key);
				} else {
					// signleValue：true：单个元素终结器，false：多个元素终结器
					expression = mode.isSignleValue() ? new ElementTerminalExpression(key) :
						new ElementListTerminalExpression(key);
				}
			}
			
			list.add(expression);
		}
		
		return list;
	}
	
	/**
	 * @description 组合抽象语法树，按照先后顺序来组合 
	 * @author mutisitic
	 * @date 2018年9月5日
	 * @param eleList
	 * @return
	 */
	private static ReadXmlExpression buildTree(List<ReadXmlExpression> eleList) {
		PrintUtil.three("Resolver.buildTree()：组合抽象语法树，按照先后顺序来组合：eleList", eleList);
		ReadXmlExpression tree = null;
		
		ReadXmlExpression prep = null;
		for (ReadXmlExpression temp : eleList) {
			if(prep == null) {
				tree = temp;
				prep = temp;
			}
			else if(prep instanceof ElementExpression) {
				ElementExpression ele = (ElementExpression) prep;
				ele.addEle(temp);
				prep = temp;
			}
			else if(prep instanceof ElementListExpression) {
				ElementListExpression ele = (ElementListExpression) prep;
				ele.addEle(temp);
				prep = temp;
			}
		}
		return tree;
	}
	
	
}
