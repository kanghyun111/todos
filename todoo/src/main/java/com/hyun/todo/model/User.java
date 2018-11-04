package com.hyun.todo.model;

import java.sql.Date;

public class User {
	private int no;
	private String id;
	private String pw;
	private String namem;
	private Date regDate;
	private Date recentDate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNamem() {
		return namem;
	}
	public void setNamem(String namem) {
		this.namem = namem;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getRecentDate() {
		return recentDate;
	}
	public void setRecentDate(Date recentDate) {
		this.recentDate = recentDate;
	}	
}
