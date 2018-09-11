package com.mutistic.structural.filter.structure;

import java.util.List;

/**
 * @program Criteria：
 * @description 过滤器接口。为所有的过滤器对象声明统一的过滤接口，用来返回匹配符合条件的Subject数据集合
 * @author mutisitic
 * @date 2018年9月11日
 */
public interface Criteria {
	
	/**
	 * @description 定义： 过滤器对象声明统一的过滤接口 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param subList 需要过滤的数据
	 * @return 根据条件过滤后的数据
	 */
	List<Subject> mettCriteria(List<Subject> subList);
	
}
