package com.mutistic.behavioral.template.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 java.util.Conllections的排序
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("java.util.Collections的排序");
		
		List<String> list = new ArrayList<String>();
		list.add("sss");
		list.add("ccc");
		list.add("hhh");
		list.add("aaa");
		PrintUtil.three("未排序前显示集合信息", list);
		
		// 声明排序规则
		Comparator<String> comp = new Comparator<String>() {
			/**
			 * @description 排序算法的具体实现
			 * @author mutisitic
			 * @date 2018年8月27日
			 * @param o1
			 * @param o2
			 * @return
			 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
			 */
			@Override
			public int compare(String o1, String o2) {
				// 比较字符串 索引大的在后，按照字符串升序
				if(o1.compareTo(o2) > 0 ) {
					return 1;
				} else if(o1.compareTo(o2) == 0) {
					return 0;
				} else {
					return -1;
				}
			}
		};
		Collections.sort(list, comp);
		PrintUtil.three("java.util.Collections排序后显示集合信息", list);
	}
}
