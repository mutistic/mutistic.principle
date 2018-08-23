package com.mutistic.behavioral.command.logger;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program 日志文件工具类
 * @description
 * @author mutisitic
 * @date 2018年8月23日
 */
@SuppressWarnings("rawtypes")
public class LogFileUtil {
	// 私有化构造函数
	private LogFileUtil() {
	}

	/**
	 * @description 读文件
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param fileName
	 * @return
	 */
	public static List readFile(String fileName) {
		List list = new ArrayList<>();
		ObjectInputStream oin = null;
		try {
			File file = new File(fileName);
			if (file.exists()) {
				oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
				list = (List) oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != oin) {
				try {
					oin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		PrintUtil.two("LogFileUtil.readFile()成功从日志文件中读取日志，读到"+ list.size() +"条队列", fileName);
		return list;
	}

	/**
	 * @description 写文件
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param fileName
	 * @param list
	 */
	public static void writeile(String fileName, List list) {
		ObjectOutputStream out = null;
		try {
			if(list != null && list.size() > 0) {
				File file = new File(fileName);
				out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				out.writeObject(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		PrintUtil.two("LogFileUtil.writeile()成功将"+ list.size() +"条队列请求写入到日志文件中", fileName);
	}

}
