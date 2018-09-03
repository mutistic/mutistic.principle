package com.mutistic.structural.flyweight.recycling;

/**
 * @program 描述享元对象缓存的配置对象
 * @description 
 * @author mutisitic
 * @date 2018年9月3日
 */
public class CacheModel {
	/**
	 * 缓存开始计时的开始时间
	 */
	private long beginTime;
	/**
	 * 缓存对象存放的持续时间，即最长不被使用的时间
	 */
	private double duralbeTime;
	/**
	 * 缓存对象是否永久存储
	 */
	private boolean forever;
	
	public CacheModel() {
		super();
	}
	
	public CacheModel(long beginTime, double duralbeTime, boolean forever) {
		super();
		this.beginTime = beginTime;
		this.duralbeTime = duralbeTime;
		this.forever = forever;
	}
	public long getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}
	public double getDuralbeTime() {
		return duralbeTime;
	}
	public void setDuralbeTime(double duralbeTime) {
		this.duralbeTime = duralbeTime;
	}
	public boolean isForever() {
		return forever;
	}
	public void setForever(boolean forever) {
		this.forever = forever;
	}
	
}
