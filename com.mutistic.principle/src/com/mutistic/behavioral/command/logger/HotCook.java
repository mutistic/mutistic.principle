package com.mutistic.behavioral.command.logger;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteReceiver
 * @description 热菜厨师
 * @author mutisitic
 * @date 2018年8月23日
 */
public class HotCook implements CookApi, Runnable {

	/**
	 * 厨师姓名
	 */
	private String compellation;
	
	/**
	 * @description 具体做菜操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param name 菜名
	 * @see com.mutistic.behavioral.command.macro.CookApi#cook(java.lang.String)
	 */
	@Override
	public void cook(String name, int tableNum) {
		PrintUtil.two("热菜师傅"+ compellation +"正在为"+ tableNum +"餐桌做菜", name);
		int time = (int) (20 * Math.random());
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		PrintUtil.two("热菜师傅"+ compellation +"用时"+ time +"，为"+ tableNum +"餐桌做菜好菜品", name);
	}
	
	/**
	 * 构造函数
	 * @param compellation 厨师姓名
	 */
	public HotCook(String compellation) {
		super();
		this.compellation = compellation;
	}
	
	/**
	 * @description 执行队列中获取一个菜品
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	@Override
	public void run() {
		while (true) {
			// 从队列中获取一条做菜命令
			try {
				Command cmd = CommandQueue.getOneCommand();
				if(null != cmd) {
					PrintUtil.two("热菜师傅"+ compellation +"从队列中获取到一条做菜命令", cmd);
					cmd.setCook(this); // 将自身传递给命令
					cmd.execute();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
				CookManager.stop();
			}
			
			// 暂停1s
			try {
				Thread.sleep(1000l);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 如果队列中没有任务，停止厨师管理
			if(CommandQueue.size() == 0) {
				CookManager.stop();
				return;
			}
		}
	}

}
