package com.mutistic.behavioral.memento.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Originator： 原发器。
 * @description 使用备忘录来保存某个时刻原发器自身的状态，也可以使用备忘录来恢复内部状态。
 * @author mutisitic
 * @date 2018年8月30日
 */
public class Originator {
	/** 示意：表示原发器的状态 */
	private String state;
	
	/**
	 * @description 获取原发器的状态
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @return
	 */
	public String getState() {
		PrintUtil.two("Originator.getState()：获取原发器的状态", state);
		return state;
	}

	/**
	 * @description 设置原发器的状态
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param state
	 */
	public void setState(String state) {
		PrintUtil.two("Originator.setState()：设置原发器的状态", state);
		this.state = state;
	}

	/**
	 * @description 创建保存原发器对象的状态的备忘录对象
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @return 创建好的备忘录对象
	 */
	public Memento createMemento() {
		Memento memento = new MementoImpl(state);
		PrintUtil.three("Originator.createMemento()：创建保存原发器对象的状态的备忘录对象：Memento", memento);
		return memento;
	}
	
	/**
	 * @description 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param memento 记录有原发器状态的备忘录对象
	 */
	public void setMemento(Memento memento) {
		MementoImpl impl = (MementoImpl) memento;
		PrintUtil.three("Originator.createMemento()：重新设置原发器对象的状态，让其回到备忘录对象记录的状态", impl);
		this.state = impl.getState();
	}
	
	/**
	 * @program MementoImpl：具体备忘录对象 
	 * @description 实现备忘录窄接口，在Originator原发器内部中实现成私有的内部类，不让外部访问。同时可以声明为静态的
	 * @author mutisitic
	 * @date 2018年8月30日
	 */
	private static class MementoImpl implements Memento {
		/** 示意：表示要保存的状态（可以是对象等，引用对象需要深度克隆） */
		private String state;
		/**
		 * 构造函数：设置要保存的状态
		 * @param state
		 */
		public MementoImpl(String state) {
			PrintUtil.two("MementoImpl()：构造函数：设置要保存的状态", state);
			this.state = state;
		}

		/**
		 * @description 获取 保存的状态 
		 * @author mutisitic
		 * @date 2018年8月30日
		 * @return
		 */
		public String getState() {
			PrintUtil.three("MementoImpl.getState()：获取 保存的状态 ", state);
			return state;
		}
		
	}
}
