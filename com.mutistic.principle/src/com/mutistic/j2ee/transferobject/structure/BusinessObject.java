package com.mutistic.j2ee.transferobject.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program BusinessObject：
 * @description 业务对象，为传输对象填充数据的业务服务
 * @author mutisitic
 * @date 2018年9月17日
 */
public class BusinessObject {
	/** 示意：传输对象集合，当作一个数据库*/
	private static List<TransferObject> objList = new ArrayList<TransferObject>();
	/**
	 * 注入测试数据
	 */
	static {
		objList.add(new TransferObject(111l, "AAA"));
		objList.add(new TransferObject(222l, "BBB"));
	}

	/**
	 * @description 获取所有的TransferObjectt数据 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @return
	 */
	public List<TransferObject> getAllObject() {
		PrintUtil.two("BusinessObject.getAllObject()", "获取所有的TransferObject数据 ");
		return objList;
	}

	/**
	 * @description 根据ID获取对应的TransferObjectt
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param id
	 * @return
	 */
	public TransferObject getObject(int id) {
		PrintUtil.two("BusinessObject.getObject()：根据ID获取对应的TransferObject", id);
		for (TransferObject model : objList) {
			if(id == model.getId()) {
				return model;
			}
		}
		return null;
	}

	/**
	 * @description 修改TransferObject数据
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param model
	 */
	public void updateObject(TransferObject object) {
		PrintUtil.two("BusinessObject.updateObject()：修改TransferObject数据", object.toString());
		for (TransferObject temp : objList) {
			if(object.getId() == temp.getId()) {
				temp.setValue(object.getValue());
				break;
			}
		}
	}
	
	/**
	 * @description 删除TransferObjectt数据 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param model
	 */
	public void deleteObject(TransferObject object) {
		PrintUtil.two("BusinessObject.deleteObject()：删除TransferObject数据 ", object.toString());
		objList.remove(object);
	}
}
