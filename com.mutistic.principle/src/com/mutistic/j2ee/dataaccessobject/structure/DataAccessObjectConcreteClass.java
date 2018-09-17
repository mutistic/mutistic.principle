package com.mutistic.j2ee.dataaccessobject.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program DataAccessObjectConcreteClass：
 * @description 数据访问对象实体类，该类实现了数据访问对象接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是 xml，或者是其他的存储机制。
 * @author mutisitic
 * @date 2018年9月17日
 */
public class DataAccessObjectConcreteClass implements DataAccessObjectInterface {
	/** 示意：数据集合：对应数据库 */
	private static List<ModelObject> objList = new ArrayList<ModelObject>();
	/** 模拟测试数据 */
	static  {
		objList.add(new ModelObject(111, "AAA"));
		objList.add(new ModelObject(222, "BBB"));
	}

	/**
	 * @description 获取所有的ModelObject数据 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @return
	 */
	@Override
	public List<ModelObject> getAllModel() {
		PrintUtil.two("DataAccessObjectConcreteClass.getAllModel()", "获取所有的ModelObject数据 ");
		return objList;
	}

	/**
	 * @description 根据ID获取对应的ModelObject
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param id
	 * @return
	 */
	@Override
	public ModelObject getModel(long id) {
		PrintUtil.two("DataAccessObjectConcreteClass.getModel()：根据ID获取对应的ModelObject", id);
		for (ModelObject model : objList) {
			if(id == model.getId()) {
				return model;
			}
		}
		return null;
	}
	
	/**
	 * @description 修改ModelObjec数据
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param model
	 */
	@Override
	public void updateModel(ModelObject model) {
		PrintUtil.two("DataAccessObjectConcreteClass.updateModel()：修改ModelObject数据", model.toString());
		for (ModelObject temp : objList) {
			if(model.getId() == temp.getId()) {
				temp.setValue(model.getValue());
				break;
			}
		}
	}
	
	/**
	 * @description 删除ModelObject数据 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param model
	 */
	@Override
	public void deleteModel(ModelObject model) {
		PrintUtil.two("DataAccessObjectConcreteClass.updateModel()：删除ModelObject数据 ", model.toString());
		objList.remove(model);
	}
}
