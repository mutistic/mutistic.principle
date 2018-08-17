package com.mutistic.behavioral.mediator.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteMediator:广义中介者
 * @description 
 * @author mutisitic
 * @date 2018年8月17日
 */
public class DeptUserMediator {

	/**
	 * 实现单例为单例模式-饿汉式
	 */
	private static DeptUserMediator instance = new DeptUserMediator();
	/**
	 * 私有构造器
	 */
	private DeptUserMediator() {
		super();
	}
	public static DeptUserMediator getInstance() {
		return instance;
	}

	/**
	 * @description 撤销部门通知-中介方法-处理员工信息
	 * @author mutisitic
	 * @date 2018年8月17日
	 * @param dept
	 * @return
	 */
	public boolean deleteDept(Dept dept) {
		if(dept == null) {
			return false;
		}
		
		PrintUtil.printThree("广义中介者接收到撤销部门通知，要撤销的部门：", dept.getDeptName());
		if (deptUserMap.get(dept) != null) {
			deptUserMap.put(new Dept("LS", "临时部门"), deptUserMap.get(dept));
			PrintUtil.printThree("成立临时部门", "将员工调整到临时部门中");
		}
		deptUserMap.remove(dept);
		PrintUtil.printThree("成功撤销部门", dept.getDeptName());

		return true;
	}

	/**
	 * @description 员工日志通知-中介方法-处理部门信息
	 * @author mutisitic
	 * @date 2018年8月17日
	 * @param user
	 * @return
	 */
	public boolean deleteUser(User user) {
		if(user == null) {
			return false;
		}
		
		PrintUtil.printThree("广义中介者接收到员工离职通知，要离职的员工：", user.getUserName());
		for (Dept dept : deptUserMap.keySet()) {
			if (deptUserMap.get(dept) != null && deptUserMap.get(dept).contains(user)) {
				deptUserMap.get(dept).remove(user);
				PrintUtil.printThree("已办理完离职手续", user.getUserName());
			}
		}

		return true;
	}

	/**
	 * 测试数据集合
	 */
	private Map<Dept, List<User>> deptUserMap = new HashMap<Dept, List<User>>();
	public void showInfo() {
		PrintUtil.printOne("[DeptUserMediator.showDeptUser()]显示部门信息");
		for (Dept dept : deptUserMap.keySet()) {
			PrintUtil.printThree("部门：", dept.toString());
			PrintUtil.printThree("部门"+ dept.getDeptName() +"的员工：", deptUserMap.get(dept));
		}
	}
	public void setDeptUserMap(Map<Dept, List<User>> deptUserMap) {
		this.deptUserMap.putAll(deptUserMap);
	}
}
