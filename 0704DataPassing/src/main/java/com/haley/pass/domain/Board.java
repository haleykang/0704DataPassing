package com.haley.pass.domain;

public class Board {
	
	// 변수
	private int num;
	private String title;
	private String content;
	private String id;
	
	// get, set
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", id=" + id + "]";
	}
	
	
	
}
