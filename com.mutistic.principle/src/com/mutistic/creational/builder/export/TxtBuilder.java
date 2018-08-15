package com.mutistic.creational.builder.export;

import java.util.List;

/**
 * @program 建造者:构建txt格式 
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class TxtBuilder implements Builder {

	/**
	 * 构建结果
	 */
	private StringBuffer buffer = new StringBuffer();

	@Override
	public Builder builderHead(GoodsHead head) {
		if (null == head) {
			return this;
		}

		buffer.append(head.toString() +"\t");
		
		return this;
	}

	@Override
	public Builder builderBody(List<GoodsBody> bodys) {
		if (null == bodys || bodys.size() == 0) {
			return this;
		}

		for (GoodsBody body : bodys) {
			buffer.append(body.toString() +"\t");
		}
		
		return this;
	}

	@Override
	public Builder builderFoot(GoodsFoot foot) {
		if (null == foot) {
			return this;
		}

		buffer.append(foot.toString() +"\t\n");
		
		return this;
	}

	public StringBuffer getResult() {
		return buffer;
	}
}
