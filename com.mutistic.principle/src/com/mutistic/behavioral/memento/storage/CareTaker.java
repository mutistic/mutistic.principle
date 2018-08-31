package com.mutistic.behavioral.memento.storage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mutistic.utils.PrintUtil;

/**
 * @program Caretaker：
 * @description 保存模拟运行流程对象：离线存储：存储到文件中
 * @author mutisitic
 * @date 2018年8月31日
 */
public class CareTaker {

	private static String FILE_NAME = "FlowMemento.txt";

	/**
	 * @description 保存备忘录对象
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param memeto
	 *            被保存的备忘录对象
	 */
	public void saveMemento(Memento memento) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FILE_NAME)));
			out.writeObject(memento);
			PrintUtil.three("CareTaker.saveMemento()：离线存储：将备忘录对象存储到文件" + FILE_NAME + "中：", memento);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != out) {
				try {
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @description 获取被保存的备忘录对象
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @return 被保存的备忘录对象
	 */
	public Memento retriverMemento() {
		Memento memento = null;
		ObjectInputStream out = null;
		try {
			out = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE_NAME)));
			memento = (Memento) out.readObject();

			PrintUtil.two("CareTaker.retriverMemento()：离线存储：从文件" + FILE_NAME + "中读取备忘录对象：", memento);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != out) {
				try {
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return memento;
	}
}
