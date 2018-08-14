package com.mutistic.design.builder.export;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mutistic.design.utils.PrintUtil;

/**
 * @program Client客户端
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class Client {

	public static void main(String[] args) {
		// 创建测试数据
		Map<Long, GoodsHead> heads = createrHead();
		Map<Long, List<GoodsBody>> bodys = createrBody();
		Map<Long, GoodsFoot> foots  = createrFoot();
		
		PrintUtil.printOne("使用TxtBuilder构建对象：");
		TxtBuilder txt = new TxtBuilder();
		Director txtDire = new Director(txt);
		txtDire.construct(heads, bodys, foots);
		PrintUtil.println(txt.getResult().toString());
		
		PrintUtil.printOne("使用XmlBuilder构建对象：");
		XmlBuilder xml = new XmlBuilder();
		Director xmlDire = new Director(xml);
		xmlDire.construct(heads, bodys, foots);
		PrintUtil.println(xml.getResult().toString());
		
	}


	/**
	 * @description 创建GoodsHead测试数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @return
	 */
	private static Map<Long, GoodsHead> createrHead() {
		return new HashMap<Long, GoodsHead>() {
			{
				put(1111l, new GoodsHead(1111l, "测试head1", "2018年8月14日"));
				put(2222l, new GoodsHead(2222l, "测试head2", "2018年8月14日"));
			}
		};
	}

	/**
	 * @description 创建GoodsBody测试数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @return
	 */
	private static Map<Long, List<GoodsBody>> createrBody() {
		return new HashMap<Long, List<GoodsBody>>() {
			{
				put(1111l, new ArrayList<GoodsBody>() {
					{
						add(new GoodsBody(1111l, "1", "测试boody1", 100d, 100d));
						add(new GoodsBody(1111l, "2", "测试boody2", 200d, 200d));
					}
				});
				put(2222l, new ArrayList<GoodsBody>() {
					{
						add(new GoodsBody(2222l, "3", "测试boody3", 300d, 300d));
						add(new GoodsBody(2222l, "4", "测试boody4", 400d, 400d));
					}
				});
			}
		};
	}
	
	/**
	 * @description 创建GoodsFoot测试数据 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @return
	 */
	private static Map<Long, GoodsFoot> createrFoot() {
		return new HashMap<Long, GoodsFoot>() {
			{
				put(1111l, new GoodsFoot(1111l, "测试foot1", "123456786763"));
				put(2222l, new GoodsFoot(2222l, "测试foot2", "000000000000"));
			}
		};
	}
}
