package com.mutistic.j2ee.dataaccessobject;

import com.mutistic.utils.PrintUtil;

/**
 * @program 数据访问对象模式[Data Access Object Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年9月17日
 */
public class DataAccessObjectPattern {
	public static void main(String[] args) {
		PrintUtil.ln("数据访问对象模式[Data Access Object Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 把低级的数据访问 API 或操作从高级的业务服务中分离出来。\r\n" + 
				"本质: 分离数据操作接口\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"DataAccessObjectInterface：数据访问对象接口，该接口定义了在一个模型对象上要执行的标准操作。\r\n" + 
				"\r\n" + 
				"DataAccessObjectConcreteClass：数据访问对象实体类，该类实现了数据访问对象接口。该类负责从数据源获取数据，\r\n" + 
				"数据源可以是数据库，也可以是 xml，或者是其他的存储机制。\r\n" + 
				"\r\n" + 
				"ModelObject/ValueObject：模型对象/数值对象，该对象是简单的POJO，包含了get/set方法来存储通过使用DAO类检索到的数据\r\n" + 
				"");
	}
}
