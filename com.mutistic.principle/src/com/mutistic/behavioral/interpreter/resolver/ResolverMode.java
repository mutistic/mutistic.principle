package com.mutistic.behavioral.interpreter.resolver;

/**
 * @program 自定义解析器Mode
 * @description 对于解析出来的元素对应的属性，为转换成抽象语法树的Mode对象
 * @author mutisitic
 * @date 2018年9月5日
 */
public class ResolverMode {

	/** 是否是单个值：true：单个值，false：多个值(后缀$表示) */
	private boolean signleValue;
	/** 是否是属性：true：属性，false：元素*/
	private boolean propertyValue;
	/** 是否是终结符：true：终结符(属性为终结符)，false：非终结符(后缀/表示)*/
	private boolean end;
	public boolean isSignleValue() {
		return signleValue;
	}
	public void setSignleValue(boolean signleValue) {
		this.signleValue = signleValue;
	}
	public boolean isPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(boolean propertyValue) {
		this.propertyValue = propertyValue;
	}
	public boolean isEnd() {
		return end;
	}
	public void setEnd(boolean end) {
		this.end = end;
	}
	public ResolverMode(boolean signleValue, boolean propertyValue, boolean end) {
		super();
		this.signleValue = signleValue;
		this.propertyValue = propertyValue;
		this.end = end;
	}
}
