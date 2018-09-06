package com.mutistic.structural.decorator.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示：实现自定义I/O流：装饰OutputStream输出流
 * @author mutisitic
 * @date 2018年9月6日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("实现自定义I/O流：装饰OutputStream输出流 ");
		try {
			String path = "src/com/mutistic/structural/decorator/io/";
			showEncrypOutputStream(path);
			showEncrypFilterOutputStream(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @description 演示：装饰OutputStream输出流的装饰器
	 * @author mutisitic
	 * @date 2018年9月6日
	 * @throws IOException
	 */
	private static void showEncrypOutputStream(String path) throws IOException {
		PrintUtil.two("演示：装饰OutputStream输出流的装饰器 ", "EncrypOutputStream");
		
		String fileName = path + "EncrypOutputStream_Test.txt";
		DataOutputStream data = new DataOutputStream(
				new BufferedOutputStream(
				new EncrypOutputStream(
				new FileOutputStream(fileName)))
		);
		String text = "abcdxyz";
		PrintUtil.three("将"+ text +"输入到文件中", fileName);
		data.write(text.getBytes());
		data.close();
	}
	
	/**
	 * @description 演示：装饰FilterOutputStream输出流的装饰器
	 * @author mutisitic
	 * @date 2018年9月6日
	 * @throws IOException
	 */
	private static void showEncrypFilterOutputStream(String path) throws IOException {
		PrintUtil.two("演示：装饰FilterOutputStream输出流的装饰器", "showEncrypFilterOutputStream");
		
		String fileName = path + "EncrypFilterOutputStream_Test.txt";
		DataOutputStream data = new DataOutputStream(
				new EncrypFilterOutputStream(
				new BufferedOutputStream(
				new FileOutputStream(fileName)))
		);
		String text = "abcdxyz";
		PrintUtil.three("将"+ text +"输入到文件中", fileName);
		data.write(text.getBytes());
		data.close();
	}
}
