package com.mutistic.behavioral.mediator.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program Client客户端-演示 广义中介者
 * @description 
 * @author mutisitic
 * @date 2018年8月17日
 */
@SuppressWarnings("serial")
public class Client {
	public static void main(String[] args) {
		// 注入测试数据
		Map<Dept, List<User>> map = new HashMap<Dept, List<User>>();
		Dept d1 = new Dept("AAA", "AAA");
		Dept d2 = new Dept("BBB", "BBB");
		
		User u1 = new User("111", "111");
		User u2 = new User("222", "222");
		User u3 = new User("333", "333");
		User u4 = new User("444", "444");
		User u5 = new User("555", "555");
		map.put(d1, new ArrayList<User>() {
			{
				add(u1);
				add(u2);
			}
		});
		map.put(d2, new ArrayList<User>() {
			{
				add(u3);
				add(u4);
				add(u5);
			}
		});
		DeptUserMediator.getInstance().setDeptUserMap(map);
		
		// 撤销部门AAA
		d1.deleteDept();
		DeptUserMediator.getInstance().showInfo();
		
		// 员工555离职
		u5.deleteUser();
		DeptUserMediator.getInstance().showInfo();
	}

}
