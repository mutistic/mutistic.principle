package com.mutistic.j2ee.compositeentity.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program CompositeEntity：
 * @description 组合实体，它是主要的实体bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。
 * @author mutisitic
 * @date 2018年9月13日
 */
public class CompositeEntity {
	/** 持有：粗粒度对象*/
	private CoarseGrainedObject object = new CoarseGrainedObject();

	/**
	 * @description 转调粗粒度对象的设置属性值功能
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param dataA 值A
	 * @param dataB 值B
	 */
	public void setData(String dataA, String dataB) {
		PrintUtil.two("CompositeEntity.setData()：转调粗粒度对象的设置属性值功能",  "dateA = "+ dataA +"，dateB = "+ dataB);
		object.setData(dataA, dataB);
	}

	/**
	 * @description 转调粗粒度对象的获取属性值功能
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @return 获取到的属性值
	 */
	public String[] getData() {
		PrintUtil.two("CompositeEntity.getData()",  "转调粗粒度对象的获取属性值功能");
		return object.getData();
	}
}
