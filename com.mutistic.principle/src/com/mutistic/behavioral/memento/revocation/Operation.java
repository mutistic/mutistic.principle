package com.mutistic.behavioral.memento.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program Invoker
 * @description 运算类：真正实现具体的业务
 * @author mutisitic
 * @date 2018年8月31日
 */
public class Operation implements OpeartionApi {

	/**
	 * 运算结果
	 */
	private int result;
	/**
	 * @description 获取运算结果
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @return
	 * @see com.mutistic.behavioral.command.revocation.OpeartionApi#getResult()
	 */
	@Override
	public int getResult() {
		return result;
	}

	/**
	 * @description 加法运算 
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param number
	 * @see com.mutistic.behavioral.command.revocation.OpeartionApi#add(int)
	 */
	@Override
	public void add(int number) {
		result += number;
		PrintUtil.three("运算类进行加法运算：Operation.add()", result);
	}

	/**
	 * @description 减法运算
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param number
	 * @see com.mutistic.behavioral.command.revocation.OpeartionApi#substract(int)
	 */
	@Override
	public void substract(int number) {
		result -= number;
		PrintUtil.three("运算类进行减法运算：Operation.substract()", result);
	}

	@Override
	public Memento createrMemento() {
		Memento memento = new MementoImpl(result);
		PrintUtil.three("Operation.createrMemento()：创建备忘录对象", memento);
		return memento;
	}

	@Override
	public void setMemento(Memento memento) {
		result = ((MementoImpl)memento).getResult();
		PrintUtil.three("Operation.setMemento()：重新设置原发器对象的状态，让其回到备忘录对象记录的状态", memento);
	}
	
	/**
	 * @program 备忘录对象：结合命令模式：可撤销命令-存储恢复式
	 * @description 
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	private static class MementoImpl implements Memento {
		private int result = 0;

		public MementoImpl(int result) {
			super();
			this.result = result;
		}

		public int getResult() {
			return result;
		}
		
	}

}
