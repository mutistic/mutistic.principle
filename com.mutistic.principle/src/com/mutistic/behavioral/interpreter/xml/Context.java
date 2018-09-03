package com.mutistic.behavioral.interpreter.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * @program Context：上下文
 * @description 解析xml的上下文
 * @author mutisitic
 * @date 2018年9月3日
 */
public class Context {
	private Element preEle;
	private Document document;
	
	/**
	 * 构造函数：传入xml文件名获取Document对象
	 * @param fileName
	 */
	public Context(String fileName) {
		this.document = XmlUtil.getRoot(fileName);
	}
	
	/**
	 * @description Expression公用方法：根据父元素和当前元素名称来获取当前元素对象
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param preEle 父元素
	 * @param eleName 当前元素名称
	 * @return 当前元素对象
	 */
	public Element getNowEle(Element preEle, String eleName) {
		NodeList list = preEle.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if(list.item(i) instanceof Element) {
				Element nowEle = (Element) list.item(i);
				if(nowEle.getTagName().equals(eleName)) {
					return nowEle;
				}
			}
		}
		
		return null;
	}

	public Element getPreEle() {
		return preEle;
	}

	public void setPreEle(Element preEle) {
		this.preEle = preEle;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
}
