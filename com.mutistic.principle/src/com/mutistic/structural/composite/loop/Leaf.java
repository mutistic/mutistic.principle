package com.mutistic.structural.composite.loop;

import com.mutistic.utils.PrintUtil;

/**
 * @program Leaf：
 * @description 叶子节点对象，定义和实现叶子对象的行为，不再包含其他的子节点对象
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Leaf extends Component {
	/** value属性值  */
	private String value;
	
	/**
	 * @description 示意方法，叶子对象可能有的方法
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @see com.mutistic.structural.composite.structure.Component#opeartion()
	 */
	@Override
	public void opeartion() {
		PrintUtil.three("Lea path", getPath());
	}

	public String getValue() {
		return value;
	}

	public Leaf(String value) {
		super();
		this.value = value;
	}
}
