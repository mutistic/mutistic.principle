package com.mutistic.behavioral.mediator.manager;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteColleague
 * @description 具体的同事类
 * @author mutisitic
 * @date 2018年8月17日
 */
public class Dept {
	private String deptId;
	private String deptName;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @description 撤销部门：通知中介者 deleteDept
	 * @author mutisitic
	 * @date 2018年8月17日
	 */
	public void deleteDept() {
		PrintUtil.printOne("[Dept.deleteDept()]撤销部门");
		DeptUserMediator.getInstance().deleteDept(this);
	}

	public Dept(String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return " [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
