package com.mutistic.structural.composite.quote;

import com.mutistic.utils.PrintUtil;

/**
 * @program Leaf：
 * @description 叶子节点对象，定义和实现叶子对象的行为，不再包含其他的子节点对象
 * @author mutisitic
 * @date 2018年8月24日
 */
public class Leaf extends Component {
	/**
	 * value属性值
	 */
	private String value;
	
	/**
	 * @description 示意方法，叶子对象可能有的方法
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param prefix
	 * @see com.mutistic.structural.composite.structure.Component#opeartion()
	 */
	@Override
	public void opeartion(String prefix) {
		PrintUtil.three(prefix + "-" + value, getParent());
	}

	public String getValue() {
		return value;
	}

	public Leaf(String value) {
		super();
		this.value = value;
	}

}
