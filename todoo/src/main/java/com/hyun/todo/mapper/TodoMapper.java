package com.hyun.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hyun.todo.model.Todo;

@Mapper
public interface TodoMapper {

	List<Todo> selectByIdWithRank(int userNo);
	
	int insertTodo(Todo todo);
	int updateTodo(Todo todo);
	int deleteTodo(int no);
	int updateState(Todo todo);
}
