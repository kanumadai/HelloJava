package com.kunuma.responsibility;

public class LeaveRequest {
	private String name;
	private int days;
	private String content;
	public LeaveRequest(String name,int days,String content) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.days = days;
		this.content = content;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
