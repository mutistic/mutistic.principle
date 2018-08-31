package com.mutistic.behavioral.memento.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示 结合命令模式：可撤销命令-存储恢复式
 * @author mutisitic
 * @date 2018年8月31日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("结合命令模式：可撤销命令-存储恢复式");
		int number = 2;
		// 创建接收者
		OpeartionApi opeartion = new Operation();
		// 创建命令对象
		AddCommand addCmd = new AddCommand(number);
		addCmd.setOpeartion(opeartion);
		SubstractCommand subCmd = new SubstractCommand(number);
		subCmd.setOpeartion(opeartion);
		
		// 创建调用者：注入命令对象实例
		Calculator calc = new Calculator();
		calc.setAddCmd(addCmd);
		calc.setSubCmd(subCmd);
		
		calc.addPressed();
		PrintUtil.three("运算完毕获取运算结果", opeartion.getResult());
		
		calc.subPressed();
		PrintUtil.three("运算完毕获取运算结果", opeartion.getResult());
		
		calc.undoPressed();
		PrintUtil.three("撤销完毕获取运算结果", opeartion.getResult());
		
		calc.undoPressed();
		PrintUtil.three("撤销完毕获取运算结果", opeartion.getResult());
		
		calc.redoPressed();
		PrintUtil.three("恢复完毕获取运算结果", opeartion.getResult());
		
	}
}
