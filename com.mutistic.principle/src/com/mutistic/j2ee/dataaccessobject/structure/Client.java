package com.mutistic.j2ee.dataaccessobject.structure;

import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 数据访问对象模式[Data Access Object Pattern]-结构
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("数据访问对象模式[Data Access Object Pattern]");
		
		// 创建数据操作接口实例
		DataAccessObjectInterface dao = new DataAccessObjectConcreteClass();
		PrintUtil.two("创建数据操作接口实例", dao);
		
		// 调用getAllModel()接口
		List<ModelObject> modelList = dao.getAllModel();
		for (ModelObject model : modelList) {
			PrintUtil.three("输出所有的ModelObject信息", model.toString());
		}

		// 调用updateModel()接口
		ModelObject model = modelList.get(0);
		model.setValue("CCCC");
		dao.updateModel(model);
		PrintUtil.three("调用updateModel()接口的数据", modelList);

		// 调用deleteModel()接口
		dao.deleteModel(modelList.get(1));
		PrintUtil.three("调用deleteModel()接口的数据", modelList);
	}
}
