package com.mutistic.design.abstractfactory.business.mybatis.impl;

import com.mutistic.design.abstractfactory.business.mybatis.IMapper;
import com.mutistic.design.utils.PrintUtil;

public class XMLFileMapper implements IMapper {

	@Override
	public void insert(Object obj) {
		PrintUtil.printTwo("XMLFileMapper.insert()", obj);
	}

}
