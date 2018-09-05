package com.mutistic.behavioral.interpreter.resolver;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context：上下文
 * @description 解析xml的上下文
 * @author mutisitic
 * @date 2018年9月3日
 */
public class Context {
	/** Dom解析XML的Doucument对象 */
	private Document document;
	private List<Element> preEleList = new ArrayList<Element>();
	
	/**
	 * 构造函数：传入xml文件名获取Document对象
	 * @param fileName
	 */
	public Context(String fileName) {
		this.document = XmlUtil.getRoot(fileName);
	}
	
	/**
	 * @description Expression公用方法：根据父元素和当前元素名称来获取当前元素集合
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param preEle 父元素
	 * @param eleName 当前元素名称
	 * @return 当前元素集合
	 */
	public List<Element> getNowEle(Element preEle, String eleName) {
		PrintUtil.three("Context.getNowEle()：根据父元素和当前元素名称来获取当前元素对象", "preEle="+ preEle.getNodeName() +"，eleName = "+ eleName);
		
		List<Element> eleList = new ArrayList<Element>();
		NodeList list = preEle.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if(list.item(i) instanceof Element) {
				Element nowEle = (Element) list.item(i);
				if(nowEle.getTagName().equals(eleName)) {
					PrintUtil.three("Context：获取到的当前元素对象", nowEle.getClass());
					eleList.add(nowEle);
				}
			}
		}
		
		return eleList;
	}
	
	/**
	 * @description 重初始化上下文 
	 * @author mutisitic
	 * @date 2018年9月5日
	 */
	public void resetInit() {
		preEleList = new ArrayList<Element>();
	}

	public List<Element> getPreEleList() {
		return preEleList;
	}

	public void setPreEleList(List<Element> preEleList) {
		this.preEleList = preEleList;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
}
