package com.hyun.todo.service;


import com.hyun.todo.model.Todo;
import com.hyun.todo.model.TodoList;

public interface TodoService {

	TodoList findTodo(TodoList listParam);
	
	int newTodo(Todo todo);
	
	int updateTodo(Todo todo);
	
	int updateState(Todo todo);
	
	int removeTodo(int no);
	
}
