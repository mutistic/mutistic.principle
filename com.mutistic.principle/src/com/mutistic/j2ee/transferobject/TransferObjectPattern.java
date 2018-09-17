package com.mutistic.j2ee.transferobject;

import com.mutistic.utils.PrintUtil;

/**
 * @program 传输对象模式[Transfer Object Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年9月17日
 */
public class TransferObjectPattern {
	public static void main(String[] args) {
		PrintUtil.ln("传输对象模式[Transfer Object Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 从客户端向服务器一次性传递带有多个属性的数据。传输对象也被称为数值对象。\r\n" + 
				"传输对象是一个具有getter/setter方法的简单的POJO类，它是可序列化的，所以它可以通过网络传输。\r\n" + 
				"它没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充POJO，并把它发送到客户端或按值传递它。\r\n" + 
				"对于客户端，传输对象是只读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值\r\n" + 
				"本质: 传输对象数据\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"BusinessObject：业务对象，为传输对象填充数据的业务服务\r\n" + 
				"    \r\n" + 
				"TransferObject：传输对象，简单的POJO，只有设置/获取属性的方法\r\n" + 
				"\r\n" + 
				"Client：客户端，可以发送请求或者发送传输对象到业务对象\r\n" + 
				"");
	}
}
