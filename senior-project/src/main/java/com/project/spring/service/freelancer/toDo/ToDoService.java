package com.project.spring.service.freelancer.toDo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.ToDo;

@Service
public interface ToDoService {
	List<ToDo> getAllToDos(int freelancerId);
}
