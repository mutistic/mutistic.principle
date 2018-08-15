package com.mutistic.creational.abstractfactory.business.mybatis.impl;

import com.mutistic.creational.abstractfactory.business.mybatis.IMapper;
import com.mutistic.utils.PrintUtil;

public class DBMapper implements IMapper {

	@Override
	public void insert(Object obj) {
		PrintUtil.printTwo("XMLFileMapper.insert()", obj);
	}

}
