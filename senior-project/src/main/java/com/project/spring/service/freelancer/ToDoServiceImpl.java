package com.project.spring.service.freelancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.ToDoDao;
import com.project.spring.model.ToDo;

@Component
public class ToDoServiceImpl implements ToDoService{
	
	@Autowired
	private ToDoDao toDoDao;
	
	@Override
	public List<ToDo> getAllToDos(int freelancerId) {
		return toDoDao.getAllToDos(freelancerId);
	}
}
