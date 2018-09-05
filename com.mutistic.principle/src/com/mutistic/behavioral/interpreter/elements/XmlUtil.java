package com.mutistic.behavioral.interpreter.elements;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import com.mutistic.utils.PrintUtil;

/**
 * @program XML解析工具
 * @description 
 * @author mutisitic
 * @date 2018年9月3日
 */
public class XmlUtil {
	/**
	 * @description 获取Document对象
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param fileName
	 * @return
	 */
	public static Document getRoot(String fileName) {
		PrintUtil.two("XmlUtil.getRoot()：开始加载文件：", fileName);
		
		Document doc = null;
		try {
			// 创建一个Document解析器工程
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// 创建一个DocumentBuilder对象，代表了具体的DOM解析器
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 货到一个表示xml文档的Document对象
			doc = builder.parse(fileName);
			// 去掉xml文档中作为格式化内容的空白而映射在DOM树中不要的信息
			doc.normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		PrintUtil.three("成功创建org.w3c.dom.Document树对象：", doc.getClass());
		return doc;
	}
}
