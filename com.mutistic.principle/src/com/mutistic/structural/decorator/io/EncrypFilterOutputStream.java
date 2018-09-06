package com.mutistic.structural.decorator.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteDecorator：实际的装饰器对象
 * @description 实现自定义I/O流：装饰FilterOutputStream输出流 
 * @author mutisitic
 * @date 2018年9月6日
 */
public class EncrypFilterOutputStream extends FilterOutputStream {
	/**
	 * 构造函数：注入OutputStream输出流 
	 * @param os OutputStream输出流 
	 */
	public EncrypFilterOutputStream(OutputStream os) {
		super(os);
	}

	/**
	 * @description 重写witer，具体的装饰功能 
	 * @author mutisitic
	 * @date 2018年9月6日
	 * @param a
	 * @throws IOException
	 * @see java.io.OutputStream#write(int)
	 */
	@Override
	public void write(int a) throws IOException {
		// 模拟加密功能
		a = a + 3;
		if(a >= (97+26)) { // a-z
			a = a - 26;
		}
		PrintUtil.three("经过EncrypOutputStream装饰功能后，输入的内容为", a);
		super.write(a);
	}

}
