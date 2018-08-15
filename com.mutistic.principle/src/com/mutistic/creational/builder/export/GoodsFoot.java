package com.mutistic.creational.builder.export;

public class GoodsFoot {

	private Long id;
	private String compName;
	private String mobile;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public GoodsFoot() {
		super();
	}
	public GoodsFoot(Long id, String compName, String mobile) {
		super();
		this.id = id;
		this.compName = compName;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "GoodsFoot [compName=" + compName + ", mobile=" + mobile + "]";
	}
}
