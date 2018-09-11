package com.mutistic.structural.filter.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 客户端，结合具体的标准匹配Subject对象集合，来过滤获得单一标准的数据集合，
 * 演示 过滤器模式[Filter Pattern]-结构
 * @author mutisitic
 * @date 2018年9月11日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("过滤器模式[Filter Pattern]-结构");
		// 添加Subject数据
		List<Subject> subList = new ArrayList<Subject>();
		subList.add(new Subject("AAA", 0));
		subList.add(new Subject("BBB", 1));
		subList.add(new Subject("CCC", 2));
		subList.add(new Subject("DDD", 0));
		
		// 创建具体的过滤器
		Criteria criteriaA = new ConcreteCriteriaA();
		PrintUtil.three("ConcreteCriteriaA过滤器过滤后的数据：", criteriaA.mettCriteria(subList));
		
		Criteria criteriaB = new ConcreteCriteriaB();
		PrintUtil.three("ConcreteCriteriaB过滤器过滤后的数据：", criteriaB.mettCriteria(subList));
	}
}
