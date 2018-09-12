package com.mutistic.behavioral.nullobject.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Factory：工厂对象 
 * @description 创建AbstractObject对象具体实例
 * @author mutisitic
 * @date 2018年9月12日
 */
public class ObjectFactory {

	/**
	 * @description 根据name创建 AbstractObject对象实例
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @param name
	 * @return 
	 */
	public static AbstractObject createrFacoty(String name) {
		AbstractObject obj = null;
		if("AAA".equals(name)) {
			obj = new RealObject();
		} else if("BBB".equals(name)) {
			obj = new RealObject();
		} else {
			obj = NullObject.getIntance();
		}
		
		PrintUtil.two("ObjectFactory.createrFacoty()：创建AbstractObject对象实例", obj);
		obj.setName(name);
		return obj;
	}
	
}
