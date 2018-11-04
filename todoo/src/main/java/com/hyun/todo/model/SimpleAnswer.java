package com.hyun.todo.model;


public class SimpleAnswer {

	private boolean result;
	private String desc;
	
	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public SimpleAnswer(boolean result) {
		// TODO Auto-generated constructor stub
		this.result = result;
	}
}
