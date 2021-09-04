package com.dev.todoList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.todoList.dao.TodoListDAO;
import com.dev.todoList.dto.TodoContent;
import com.dev.todoList.dto.User;
import com.dev.todoList.service.TodoListService;

@Service
public class TodoListServiceImpl implements TodoListService{

	
		@Autowired
		private TodoListDAO todoListDao;

		@Override
		public List<TodoContent> getAllTodoContent(User user) {
			return todoListDao.getAllTodoContent(user);
		}
		
		
	
}
