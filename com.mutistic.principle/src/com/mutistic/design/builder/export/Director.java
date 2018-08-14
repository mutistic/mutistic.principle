package com.mutistic.design.builder.export;

import java.util.List;
import java.util.Map;

/**
 * @program Director：使用Builder创建需要的数据格式
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	/**
	 * @description 组装数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param heads
	 * @param bodys
	 * @param foots
	 */
	public void construct(Map<Long, GoodsHead> heads, Map<Long, List<GoodsBody>> bodys, Map<Long, GoodsFoot> foots) {
		if(null == heads || heads.size() == 0) {
			return;
		}
		
		for(Long key : heads.keySet()) {
			// 链式写法
			this.builder.builderHead(heads.get(key))
				.builderBody(bodys.get(key))
				.builderFoot(foots.get(key));
		}
	}
	
}
