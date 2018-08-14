package com.mutistic.design.builder.export;

public class GoodsHead {

	private Long id;
	private String title;
	private String time;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public GoodsHead(Long id, String title, String time) {
		super();
		this.id = id;
		this.title = title;
		this.time = time;
	}
	public GoodsHead() {
		super();
	}
	@Override
	public String toString() {
		return "GoodsHead [id=" + id + ", title=" + title + ", time=" + time + "]";
	}
}
