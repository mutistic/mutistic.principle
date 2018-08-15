package com.mutistic.principle.simplefactory.animal;

/**
 * @program 动物类型枚举
 * @description 
 * @author mutistic
 * @date 2018年5月12日
 */
public enum AnimalTypeEnum {
	
	BIRD("bird"),
	DUCK("duck"),
	GOOSE("goose"),
	PENGUIN("penguin"),
	DONALDDUCK("donaldDuck")
	;

	/** 枚举常量绑定值 **/
	private String key;
	
	private AnimalTypeEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
}
