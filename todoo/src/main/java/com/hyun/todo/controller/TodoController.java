package com.hyun.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hyun.todo.model.SimpleAnswer;
import com.hyun.todo.model.Todo;
import com.hyun.todo.model.TodoList;
import com.hyun.todo.service.TodoService;

@CrossOrigin(origins="*")
@RestController
public class TodoController {

	@Autowired
	TodoService todoService;

	@GetMapping("/todo")
	public TodoList getTodoList(@RequestParam("userNo") int userNo, @RequestParam(value="sortName", required=false,defaultValue="rank") String sortName) {
		TodoList todoList = new TodoList(userNo);
		todoList.setSortName(sortName);
		todoList = todoService.findTodo(todoList);
		return todoList;
	}


	@PostMapping("/todo")
	public SimpleAnswer newTodo(@RequestBody(required=false) Todo todo) {
		SimpleAnswer answer = new SimpleAnswer(todoService.newTodo(todo)==1 ? true : false);
		if(answer.isResult())
			answer.setDesc("Make New One Success");
		else
			answer.setDesc("Make New One Fail");
		return answer;
	}

	@PutMapping("/todo")
	public SimpleAnswer modifyTodo(@RequestBody(required=false) Todo todo) {
		SimpleAnswer answer;
		if(todo.getTitle()==null) {
			answer = new SimpleAnswer(todoService.updateState(todo)==1 ? true : false);
		}else {
			answer = new SimpleAnswer(todoService.updateTodo(todo)==1 ? true : false);
		}
		if(answer.isResult())
			answer.setDesc("Update Success");
		else
			answer.setDesc("Update Fail");

		return answer;
	}

	@DeleteMapping("/todo")
	public SimpleAnswer deleteTodo(@RequestParam("no") int no) {
		SimpleAnswer answer = new SimpleAnswer(todoService.removeTodo(no)==1 ? true : false);

		if(answer.isResult())
			answer.setDesc("Delete Success");
		else
			answer.setDesc("Delete Fail");

		return answer;
	}

}