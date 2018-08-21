package com.mutistic.behavioral.mediator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteMediator
 * @description 具体中介者实现对象。需要了解并维护各个同事对象，并负责具体的协调各同事对象的交互关系
 * @author mutisitic
 * @date 2018年8月16日
 */
public class ConcreteMediator implements Mediator {

	/**
	 * 持有并维护同事A
	 */
	private ConcreteColleagueA colleagueA;
	/**
	 * 持有并维护同事B
	 */
	private ConcreteColleagueB colleagueB;

	/**
	 * @description 同事对象在自身改变的时候通知中介者的方法，负责与其他同事之间的交互
	 * @author mutisitic
	 * @date 2018年8月16日
	 * @param colleague  同事对象实例
	 */
	@Override
	public void changed(Colleague colleague) {
		PrintUtil.one("注意使用中介者模式不要产生循环调用，这样会造成死循环");
		
		if (null == colleague) {
			PrintUtil.one("传入的同事为空，changed结束");
		}

		PrintUtil.three("某个同事类发生了变化，通常需要与其他同事交互", colleague);
		// colleagueA 转调  colleagueB.operation()业务
		if (colleague.getClass() == colleagueA.getClass()) {
			if (null != colleagueB) {
				PrintUtil.three("具体协调相应的同事对象来实现协作", colleagueB);
				this.colleagueB.operation();
			}
		} 
		// colleagueB 转调  colleagueA.operationA()业务
		else if (colleague.getClass() == colleagueB.getClass()) {
			if (null != colleagueA) {
				PrintUtil.three("具体协调相应的同事对象来实现协作", colleagueA);
				this.colleagueA.operationA();
			}
		}
	}

	/**
	 * @description 设置中介者需要了解并维护的同事A实例
	 * @author mutisitic
	 * @date 2018年8月16日
	 * @param colleagueA 同事A对象实例
	 */
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
		PrintUtil.three("设置中介者需要了解并维护的同事A实例 ", colleagueA);
	}

	/**
	 * @description 设置中介者需要了解并维护的同事B实例
	 * @author mutisitic
	 * @date 2018年8月16日
	 * @param colleagueB 同事B对象实例
	 */
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
		PrintUtil.three("设置中介者需要了解并维护的同事B实例 ", colleagueB);
	}

}
