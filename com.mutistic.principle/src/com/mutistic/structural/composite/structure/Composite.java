package com.mutistic.structural.composite.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Composite：
 * @description 组合对象，通常会存储子组件即叶子节点，定义包含子组件的那些组件的行为，并实现在组件接口中定义的与子组件有关的操作
 * @author mutisitic
 * @date 2018年8月24日
 */
public class Composite extends Component {
	/** 用来存储组合对象中包含的子组件对象集合 */
	private List<Component> childComps;

	/**
	 * @description 示意方法，组合对象中通里面需要实现递归的调用
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @see com.mutistic.structural.composite.structure.Component#opeartion()
	 */
	@Override
	public void opeartion() {
		if (childComps == null) {
			return;
		}
		for (Component comp : childComps) {
			// 递归的进行子组件相应方法的调用
			PrintUtil.three("递归的进行子组件相应方法的调用", comp);
			comp.opeartion();
		}
		PrintUtil.println();
	}

	/**
	 * @description 向组合对象中加入组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param child 被加入组合对象中的组件对象
	 * @see com.mutistic.structural.composite.structure.Component#addChild(com.mutistic.structural.composite.structure.Component)
	 */
	@Override
	public void addChild(Component child) {
		if(childComps == null) {
			childComps = new ArrayList<Component>();
		}
		childComps.add(child);
	}

	/**
	 * @description 从组合对象中移除组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param child 被移除组件对象
	 * @see com.mutistic.structural.composite.structure.Component#removeChild(com.mutistic.structural.composite.structure.Component)
	 */
	@Override
	public void removeChild(Component child) {
		if(child != null && childComps != null) {
			childComps.remove(child);
		}
	}

	/**
	 * @description 获取某个索引对应的组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param index 索引
	 * @return 索引对应的组件对象
	 * @see com.mutistic.structural.composite.structure.Component#getChildrend(int)
	 */
	@Override
	public Component getChildrend(int index) {
		if(childComps == null) {
			return null;
		}
		
		return childComps.get(index);
	}
	
}
