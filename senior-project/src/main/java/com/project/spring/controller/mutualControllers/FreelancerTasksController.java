package com.project.spring.controller.mutualControllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.ToDo;
import com.project.spring.service.freelancer.ToDoService;

@RestController
@RequestMapping("/freelancer")
public class FreelancerTasksController {

	@Autowired
	private ToDoService toDoService;

	@PostMapping("/toDo/{freelancerId}")
	@ResponseBody
	public ResponseEntity<List<ToDo>> getAllToDos(
			@PathVariable int freelancerId) throws ParseException {
		List<ToDo> todos = toDoService.getAllToDos(freelancerId);
		return ResponseEntity.ok(todos); 
	}
}
