package com.mutistic.behavioral.command.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 创建具体的命令对象，并且设置命令对象的接收者。注意这个不是常规意义上的客户端，而是在组装命令对象和接收者，
 *              把这个Client成为装配置会更合适，因为真正使用命令的客户端是从Invoker来触发执行。
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Client {

	public static void main(String[] args) {
		PrintUtil.one("命令模式[Command Pattern]");
		Invoker invoker = new Client().assemble();
		invoker.runCommand();
	}

	/**
	 * @description 组装命令对象和接收者
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	public Invoker assemble() {
		Receiver receiver = new Receiver();
		PrintUtil.two("创建接收者对象实例", receiver);

		Command cmd = new ConcreteCommand(receiver);
		PrintUtil.three("创建命令对象实例，注入接收者对象实例", cmd);

		Invoker invoker = new Invoker();
		invoker.setCommand(cmd);
		PrintUtil.two("创建调用者对象实例，注入命令对象实例", invoker);

		return invoker;
	}
}
