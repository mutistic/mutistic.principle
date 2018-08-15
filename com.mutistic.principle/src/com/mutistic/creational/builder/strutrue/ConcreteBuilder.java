package com.mutistic.creational.builder.strutrue;

/**
 * @program ConcreteBuilder
 * @description 具体的建造者实现，实现各个组件的创建，并负责组装Product对象的各个组件，同时还提供一个让客户端获取组装完成后的产品对象的方法
 * @author mutisitic
 * @date 2018年8月14日
 */
public class ConcreteBuilder implements Builder {

	/**
	 * 声明产品对象私有成员
	 */
	private Product resultProduct;
	
	/**
	 * @description 创建一个Product对象所需要的各个组件的操作的具体实现
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @see com.mutistic.design.builder.strutrue.Builder#builderPart()
	 */
	@Override
	public void builderPart() {
		resultProduct = new Product() { }; // 测试
	}

	/**
	 * @description 返回构建后的具体产品对象 
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @return
	 */
	public Product getResultProduct() {
		return resultProduct;
	}

}
