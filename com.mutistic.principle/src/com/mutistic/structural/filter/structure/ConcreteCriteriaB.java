package com.mutistic.structural.filter.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCriteria：
 * @description 具体的过滤器。持有Subject数据集合，实现具体的过滤功能，通过匹配条件来达到过滤数据的目的
 * @author mutisitic
 * @date 2018年9月11日
 */
public class ConcreteCriteriaB implements Criteria {
	
	/**
	 * @description 实现具体的过滤功能，通过匹配条件来达到过滤数据的目的 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param subList 需要过滤的数据
	 * @return 根据条件过滤后的数据
	 */
	@Override
	public List<Subject> mettCriteria(List<Subject> subList) {
		PrintUtil.two("ConcreteCriteriaB.mettCriteria()", "实现具体的过滤功能，通过匹配条件来达到过滤数据的目的");

		List<Subject> remove = new ArrayList<Subject>();
		for (Subject subject : subList) {
			if(subject.getPropertyB() <= 0) {
				remove.add(subject);
			}
		}
		
		subList.removeAll(remove);
		return subList;
	}

}
