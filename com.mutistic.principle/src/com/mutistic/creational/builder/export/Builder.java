package com.mutistic.creational.builder.export;

import java.util.List;

/**
 * @program 建造者：由于构建产品没有共通性，可以不用返回
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public interface Builder {

	/**
	 * @description 构建head数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param head
	 */
	Builder builderHead(GoodsHead head);

	/**
	 * @description 构建body数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param bodys
	 */
	Builder builderBody(List<GoodsBody> bodys);

	/**
	 * @description 构建foot数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param bodys
	 */
	Builder builderFoot(GoodsFoot foot);
}
