package com.hyun.todo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyun.todo.mapper.TodoMapper;
import com.hyun.todo.model.Todo;
import com.hyun.todo.model.TodoList;

@Service("todoService")
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	TodoMapper todoMapper;

	@Override
	public TodoList findTodo(TodoList todoList) {
		// TODO Auto-generated method stub
		ArrayList<Todo> todos = (ArrayList<Todo>)todoMapper.selectByIdWithRank(todoList.getUserNo());
		todoList.setTodoList(todos);
		todoList.setCount(todos.size());
		
		return todoList;
	}
	
	@Override
	public int newTodo(Todo todo) {
		// TODO Auto-generated method stub
		int result = todoMapper.insertTodo(todo);
		
		return result;
	}

	@Override
	public int updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		int result = todoMapper.updateTodo(todo);
		return result;
	}

	@Override
	public int removeTodo(int no) {
		// TODO Auto-generated method stub
		int result = todoMapper.deleteTodo(no);
		
		return result;
	}

	@Override
	public int updateState(Todo todo) {
		// TODO Auto-generated method stub
		int result = todoMapper.updateState(todo);
		return result;
	}

}
