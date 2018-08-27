package com.mutistic.structural.composite.loop;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Composite：
 * @description 组合对象，通常会存储子组件即叶子节点，定义包含子组件的那些组件的行为，并实现在组件接口中定义的与子组件有关的操作
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Composite extends Component {
	/** 用来存储组合对象中包含的子组件对象集合 */
	private List<Component> childComps;
	/** value属性值 */
	private String value;

	/**
	 * @description 示意方法，组合对象中通里面需要实现递归的调用
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @see com.mutistic.structural.composite.structure.Component#opeartion()
	 */
	@Override
	public void opeartion() {
		PrintUtil.three("Composite path", getPath());

		if (childComps != null) {
			for (Component comp : childComps) {
				comp.opeartion();
			}
		}
	}

	/**
	 * @description 向组合对象中加入组件对象
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @param child
	 *            被加入组合对象中的组件对象
	 * @see com.mutistic.structural.composite.structure.Component#addChild(com.mutistic.structural.composite.structure.Component)
	 */
	@Override
	public void addChild(Component child) {
		if (childComps == null) {
			childComps = new ArrayList<Component>();
		}
		childComps.add(child);
		contains(child);
	}

	/**
	 * @description 环状引用，通过节点判断路存在环状引用
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @param child
	 */
	private void contains(Component child) {
		// 判断是否是根节点，是则直接添加节点
		if (getPath() == null) {
			setPath(value);
		}

		// 判断组件路由是否已经存在
		if (getPath().startsWith(child.getValue() + ".")) {
			throw new IllegalArgumentException("存在环状引用：在节点" + getPath() + "中，子节点" + child.getValue() + "已经被添加过");
		} else if (getPath().indexOf("." + child.getValue()) < 0) {
			setPath(getPath() + "." + child.getValue());
		} else {
			throw new IllegalArgumentException("存在环状引用：在节点" + getPath() + "中，子节点" + child.getValue() + "已经被添加过");
		}
	}

	/**
	 * @description 从组合对象中移除组件对象
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @param child
	 *            被移除组件对象
	 * @see com.mutistic.structural.composite.structure.Component#removeChild(com.mutistic.structural.composite.structure.Component)
	 */
	@Override
	public void removeChild(Component child) {
		if (child != null && childComps != null && childComps.contains(child)) {
			childComps.remove(child);
		}
	}

	/**
	 * @description 获取某个索引对应的组件对象
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @param index
	 *            索引
	 * @return 索引对应的组件对象
	 * @see com.mutistic.structural.composite.structure.Component#getChildrend(int)
	 */
	@Override
	public Component getChildrend(int index) {
		if (childComps == null) {
			return null;
		}

		return childComps.get(index);
	}

	/**
	 * @description 获取所有子组件对象集合
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @return
	 * @see com.mutistic.structural.composite.structure.Component#getChildrend(int)
	 */
	@Override
	public List<Component> getChildrend() {
		return childComps;
	}

	public String getValue() {
		return value;
	}

	public Composite(String value) {
		super();
		this.value = value;
	}

}
