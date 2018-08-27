package com.mutistic.behavioral.template.java;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 Java回调
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("Java回调机制：");
		AbstractClass abs = new AbstractClass() {
			/**
			 * @description 原语操作1：使用匿名内部类来实现回调方法
			 * @author mutisitic
			 * @date 2018年8月27日
			 * @see com.mutistic.behavioral.template.java.AbstractClass#doPrimitiveOpeartion1()
			 */
			@Override
			public void doPrimitiveOpeartion1() {
				PrintUtil.three("使用匿名内部类来实现回调方法doPrimitiveOpeartion1()", "原语操作1：具体实现");
			}
			
			/**
			 * @description 原语操作2：使用匿名内部类来实现回调方法
			 * @author mutisitic
			 * @date 2018年8月27日
			 * @see com.mutistic.behavioral.template.java.AbstractClass#doPrimitiveOpeartion2()
			 */
			@Override
			public void doPrimitiveOpeartion2() {
				PrintUtil.three("使用匿名内部类来实现回调方法doPrimitiveOpeartion2()", "原语操作2：具体实现");
			}

			/**
			 * @description 钩子操作：使用匿名内部类来实现回调方法
			 * @author mutisitic
			 * @date 2018年8月27日
			 * @see com.mutistic.behavioral.template.java.AbstractClass#hookOpeation1()
			 */
			@Override
			protected void hookOpeation1() {
				PrintUtil.three("使用匿名内部类来实现回调方法hookOpeation1()", "钩子操作：具体实现");
			}
			
		};
		abs.templateMethod();
	}
}
