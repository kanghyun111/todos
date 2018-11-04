package com.hyun.todo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyun.todo.model.SimpleAnswer;

@RequestMapping("/error")
@RestController
public class ExceptionHandlerController {

	
	@ExceptionHandler(Exception.class)
	public SimpleAnswer errorPage(Exception excp) {
		SimpleAnswer ans = new SimpleAnswer(true);
		ans.setDesc(excp.getMessage());
		return ans;
	}
}
