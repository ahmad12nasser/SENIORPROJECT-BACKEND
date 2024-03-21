package com.project.spring.dao.freelancer.toDo;

import java.util.List;

import com.project.spring.model.ToDo;

public interface ToDoDao {

	List<ToDo> getAllToDos(int freelancerId);
}
