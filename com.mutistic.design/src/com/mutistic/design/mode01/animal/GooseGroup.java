package com.mutistic.design.mode01.animal;

/**
 * @program 雁群
 * @description 
 * @author yc.yin
 * @date 2018年5月12日
 */
public class GooseGroup {
	/**
	 * 雁群
	 */
	public Goose[] gooses;

	/**
	 * @description 一字飞行
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	public void lineFlight() {
		System.out.println("雁群正在一字飞行");
	}

	/**
	 * @description V字飞行 
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	public void vFlight() {
		System.out.println("雁群正在V字飞行");
	}
}
