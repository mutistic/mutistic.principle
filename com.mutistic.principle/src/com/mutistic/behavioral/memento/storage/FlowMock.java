package com.mutistic.behavioral.memento.storage;

import java.io.Serializable;

import com.mutistic.utils.PrintUtil;

/**
 * @program Originator
 * @description 模拟运行流程：原发器：结合原型模式-Java的Clone功能
 * @author mutisitic
 * @date 2018年8月31日
 */
public class FlowMock implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 流程名称：不需要外部存储的状态数据 */
	private String flowName;
	/** 示意：代指结果，需要外部存储的状态数据 */
	private int result;
	/** 示意：代指状态，需要外部存储的状态数据 */
	private String state = "";

	/**
	 * 构造函数：设置流程名称
	 * 
	 * @param flowName
	 */
	public FlowMock(String flowName) {
		super();
		this.flowName = flowName;
	}

	/**
	 * @description 第一阶段
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	public void first() {
		state += "Schema";
		result = result + 1;

		PrintUtil.two("FlowMock.first() 第一阶段：result=" + result, "state=" + state);
	}
	
	/**
	 * @description 执行模式一
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	public void schemaOne() {
		state += " Schema One";
		result += 11;

		PrintUtil.two("FlowMock.schemaOne() 执行模式一：result=" + result, "state=" + state);
	}
	
	/**
	 * @description 执行模式二
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	public void schemaTwo() {
		state += " Schema Two";
		result += 22;

		PrintUtil.two("FlowMock.schemaTwo() 执行模式二：result=" + result, "state=" + state);
	}

	/**
	 * @description 创建保存原发器对象的状态的备忘录对象
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @return
	 */
	public Memento createrMemento() {
		try {
			FlowMock mock = (FlowMock)this.clone();
			PrintUtil.two("FlowMock.createrMemento()：使用原型模式克隆保存原发器对象：原对象", this);
			PrintUtil.three("FlowMock.createrMemento()：使用原型模式克隆保存原发器对象：克隆对象", mock);
			
			return new MementoImpl(mock);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @description 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param memento
	 */
	public void setMemento(Memento memento) {
		MementoImpl impl = (MementoImpl) memento;
		this.result = impl.getFlow().getResult();
		this.state = impl.getFlow().getState();
		PrintUtil.three("FlowMock.setMemento()：重新设置原发器对象的状态，让其回到备忘录对象记录的状态", memento);
	}
	
	/**
	 * @program MementoImpl：具体备忘录对象 
	 * @description 
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	private static class MementoImpl implements Memento {
		private static final long serialVersionUID = 1L;
		
		private FlowMock flow;

		public MementoImpl(FlowMock flow) {
			super();
			this.flow = flow;
		}

		public FlowMock getFlow() {
			return flow;
		}
		
	}
	
	// get/set方法
	public String getFlowName() {
		return flowName;
	}
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
