package com.mutistic.behavioral.mediator.manager;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteColleague
 * @description 具体的同事类
 * @author mutisitic
 * @date 2018年8月17日
 */
public class User {
	private String userId;
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @description 员工离职：通知中介者 deleteUser
	 * @author mutisitic
	 * @date 2018年8月17日
	 */
	public void deleteUser() {
		PrintUtil.one("[User.deleteUser()]员工离职");
		DeptUserMediator.getInstance().deleteUser(this);
	}

	public User(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "[userId=" + userId + ", userName=" + userName + "]";
	}

}
