package com.mutistic.j2ee.dataaccessobject.structure;

import java.util.List;

/**
 * @program DataAccessObjectInterface：
 * @description 数据访问对象接口，该接口定义了在一个模型对象上要执行的标准操作。
 * @author mutisitic
 * @date 2018年9月17日
 */
public interface DataAccessObjectInterface {
	/**
	 * @description 定义：获取所有的ModelObject数据 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @return
	 */
	List<ModelObject> getAllModel();

	/**
	 * @description 定义：根据ID获取对应的ModelObject
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param id
	 * @return
	 */
	ModelObject getModel(long id);

	/**
	 * @description 定义：修改ModelObjec数据
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param model
	 */
	void updateModel(ModelObject model);

	/**
	 * @description 定义：删除ModelObject数据 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param model
	 */
	void deleteModel(ModelObject model);
}
