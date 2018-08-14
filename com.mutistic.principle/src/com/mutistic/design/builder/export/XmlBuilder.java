package com.mutistic.design.builder.export;

import java.util.List;

/**
 * @program 建造者:构建xml格式 
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class XmlBuilder implements Builder {

	/**
	 * 构建结果
	 */
	private StringBuffer buffer = new StringBuffer();

	@Override
	public Builder builderHead(GoodsHead head) {
		if (null == head) {
			buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			buffer.append("<data>\n");
			return this;
		}
		
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		buffer.append("<data>\n");
		buffer.append("\t<id>" + head.getId() + "</id>\n");
		buffer.append("\t<title>" + head.getTitle() + "</title>\n");
		buffer.append("\t<time>" + head.getTime() + "</time>\n");
		
		return this;
	}

	@Override
	public Builder builderBody(List<GoodsBody> bodys) {
		if (null == bodys || bodys.size() == 0) {
			buffer.append("\t\t<goodsList>\n</goodsList>\n");
			return this;
		}

		buffer.append("\t<goodsList>\n");
		for (GoodsBody body : bodys) {
			buffer.append("\t\t<goods>\n");
			buffer.append("\t\t\t<goodsNo>" + body.getGoodsNo() + "</goodsNo>\n");
			buffer.append("\t\t\t<name>" + body.getName() + "</name>\n");
			buffer.append("\t\t\t<price>" + body.getPrice() + "</price>\n");
			buffer.append("\t\t\t<number>" + body.getNumber() + "</number>\n");
			buffer.append("\t\t<goods>\n");
		}
		buffer.append("\t</goodsList>\n");
		
		return this;
	}

	@Override
	public Builder builderFoot(GoodsFoot foot) {
		if (null == foot) {
			buffer.append("</data>");
			return this;
		}
		buffer.append("\t<compName>" + foot.getCompName() + "</compName>\n");
		buffer.append("\t<mobile>" + foot.getMobile() + "</mobile>\n");
		buffer.append("</data>\n\n");
		
		return this;
	}

	public StringBuffer getResult() {
		return buffer;
	}

}
