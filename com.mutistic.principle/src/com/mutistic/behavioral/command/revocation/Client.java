package com.mutistic.behavioral.command.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示 可撤销命令
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("可撤销命令：补偿式，又称为反操作式");
		int number = 2;
		// 创建接收者
		OpeartionApi opeartion = new Operation();
		// 创建命令对象
		AddCommand addCmd = new AddCommand(opeartion, number);
		SubstractCommand subCmd = new SubstractCommand(opeartion, number);
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
