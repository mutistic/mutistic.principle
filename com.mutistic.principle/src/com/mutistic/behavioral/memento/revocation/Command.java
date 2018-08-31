package com.mutistic.behavioral.memento.revocation;

/**
 * @program Command
 * @description 命令接口：可撤销命令：补偿式，又称为反操作式
 * @author mutisitic
 * @date 2018年8月31日
 */
public interface Command {
	/**
	 * @description 定义：执行命令
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	void execute();

	/**
	 * @description 定义：撤销命令：恢复到备忘录对象记录的状态
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param memento 备忘录对象
	 */
	void undo(Memento memento);
	
	/**
	 * @description 定义：恢复命令：恢复到备忘录对象记录的状态
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param memento 备忘录对象
	 */
	void redo(Memento memento);
	
	/**
	 * @description 定义：创建保存原发器对象的状态的备忘录对象
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @return 创建好的状态的备忘录对象
	 */
	Memento createrMemento();
}
