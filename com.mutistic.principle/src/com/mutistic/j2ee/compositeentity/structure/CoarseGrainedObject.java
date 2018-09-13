package com.mutistic.j2ee.compositeentity.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program CoarseGrainedObject：
 * @description 粗粒度对象，该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
 * @author mutisitic
 * @date 2018年9月13日
 */
public class CoarseGrainedObject {
	/** 持有：细粒度对象A */
	private DependentObjectA objA = new DependentObjectA();
	/** 持有：细粒度对象B */
	private DependentObjectB objB = new DependentObjectB();

	/**
	 * @description 设置所持有的细粒度对象的属性值
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param dataA 需要设置的细粒度对象属性值data值
	 * @param dataB 需要设置的细粒度对象属性值data值
	 */
	public void setData(String dataA, String dataB) {
		objA.setData(dataA);
		objB.setData(dataB);
		PrintUtil.three("CoarseGrainedObject.setData()：设置所持有的细粒度对象的属性值", "dateA = "+ dataA +"，dateB = "+ dataB);
	}

	/**
	 * @description 获取所持有的细粒度对象的属性值 
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @return 获取到的属性值
	 */
	public String[] getData() {
		PrintUtil.three("CoarseGrainedObject.getData()", "获取所持有的细粒度对象的属性值");
		return new String[] { objA.getData(), objB.getData() };
	}
}
