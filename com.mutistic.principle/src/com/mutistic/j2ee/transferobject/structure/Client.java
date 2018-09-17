package com.mutistic.j2ee.transferobject.structure;

import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端，可以发送请求或者发送传输对象到业务对象
 * @description 演示：传输对象模式[Transfer Object Pattern]-结构
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("传输对象模式[Transfer Object Pattern]");

		// 创建数据操作接口实例
		BusinessObject business = new BusinessObject();
		PrintUtil.two("创建业务对象实例", business);

		// 调用getAllObject()接口
		List<TransferObject> objList = business.getAllObject();
		for (TransferObject model : objList) {
			PrintUtil.three("输出所有的TransferObject信息", model.toString());
		}

		// 调用updateObject()接口
		TransferObject model = objList.get(0);
		model.setValue("CCCC");
		business.updateObject(model);
		PrintUtil.three("调用updateObject()接口的数据", objList);

		// 调用deleteObject()接口
		business.deleteObject(objList.get(1));
		PrintUtil.three("调用deleteObject()接口的数据", objList);
	}
}
