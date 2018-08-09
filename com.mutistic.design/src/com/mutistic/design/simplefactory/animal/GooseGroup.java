package com.mutistic.design.simplefactory.animal;

/**
 * @program 雁群
 * @description 
 * @author mutistic
 * @date 2018年5月12日
 */
public class GooseGroup {
	/**
	 * 雁群
	 */
	public Goose[] gooses;

	/**
	 * @description 一字飞行
	 * @author mutistic
	 * @date 2018年5月12日
	 */
	public void lineFlight() {
		System.out.println("雁群正在一字飞行");
	}

	/**
	 * @description V字飞行 
	 * @author mutistic
	 * @date 2018年5月12日
	 */
	public void vFlight() {
		System.out.println("雁群正在V字飞行");
	}
}
