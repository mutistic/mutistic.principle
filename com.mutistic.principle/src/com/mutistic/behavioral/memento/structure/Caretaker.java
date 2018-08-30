package com.mutistic.behavioral.memento.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Caretaker： 备忘录管理者
 * @description 或者称为备忘录负责人。主要负责保存备忘录对象，但是不能对备忘录对象的内容过行操作或检查。
 * @author mutisitic
 * @date 2018年8月30日
 */
public class Caretaker {
	/** 持有 保存的备忘录对象*/
	private Memento memento;
	
	/**
	 * @description 保存备忘录对象 
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param memeto 被保存的备忘录对象
	 */
	public void saveMemento(Memento memento) {
		PrintUtil.three("Caretaker.saveMemento()：保存备忘录对象", memento);
		this.memento = memento;
	}
	
	/**
	 * @description 获取被保存的备忘录对象 
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @return 被保存的备忘录对象
	 */
	public Memento retriverMemento() {
		PrintUtil.two("Caretaker.retriverMemento()：获取被保存的备忘录对象 ", memento);
		return memento;
	}
}
