package com.mutistic.principle.abstractfactory.business.mybatis.impl;

import com.mutistic.principle.abstractfactory.business.mybatis.IMapper;
import com.mutistic.utils.PrintUtil;

public class XMLFileMapper implements IMapper {

	@Override
	public void insert(Object obj) {
		PrintUtil.printTwo("XMLFileMapper.insert()", obj);
	}

}
