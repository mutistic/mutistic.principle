package com.mutistic.j2ee.compositeentity;

import com.mutistic.utils.PrintUtil;

/**
 * @program 组合实体模式[Composite Entity Pattern]
 * @description
 * @author mutisitic
 * @date 2018年9月13日
 */
public class CompositeEntityPattern {
	public static void main(String[] args) {
		PrintUtil.ln("组合实体模式[Composite Entity Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 在EJB持久化机制中，一个组合实体是一个EJB实体bean，代表了对象的图解。当更新一个组合实体时，\r\n" + 
				"内部依赖对象beans会自动更新，因为它们是由EJB实体bean管理的。\r\n" + 
				"本质: 组合实体，自动更新\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"CompositeEntity：组合实体，它是主要的实体bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。\r\n" + 
				"\r\n" + 
				"CoarseGrainedObject：粗粒度对象，该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。\r\n" + 
				"\r\n" + 
				"DependentObject：依赖对象，是一个持续生命周期依赖于粗粒度对象的对象。\r\n" + 
				"\r\n" + 
				"Strategies：策略，表示如何实现组合实体。\r\n" + 
				"");
	}
}
