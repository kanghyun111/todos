package com.hyun.todo.model;

import java.util.ArrayList;


public class TodoList {
	private int count;
	private int userNo;
	private String sortName;
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public ArrayList<Todo> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<Todo> todoList) {
		this.todoList = todoList;
	}

	private String sortType;
	private ArrayList<Todo> todoList;
	
	public TodoList(int userNo) {
		// TODO Auto-generated constructor stub
		this.userNo = userNo;
	}
}
