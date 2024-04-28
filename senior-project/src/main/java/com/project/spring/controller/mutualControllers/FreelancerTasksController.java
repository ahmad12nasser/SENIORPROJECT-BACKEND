package com.project.spring.controller.mutualControllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.TempFinishTaskModel;
import com.project.spring.model.ToDo;
import com.project.spring.service.freelancer.toDo.CancelTaskService;
import com.project.spring.service.freelancer.toDo.FinishTaskService;
import com.project.spring.service.freelancer.toDo.ToDoService;

@RestController
@RequestMapping("/freelancer/toDo")
public class FreelancerTasksController {

	@Autowired
	private ToDoService toDoService;
	@Autowired
	private FinishTaskService finishTaskService;
	@Autowired
	private CancelTaskService cancelTaskService;

	@PostMapping("/{freelancerId}")
	@ResponseBody
	public ResponseEntity<List<ToDo>> getAllToDos(
			@PathVariable int freelancerId) throws ParseException {
		List<ToDo> todos = toDoService.getAllToDos(freelancerId);
		return ResponseEntity.ok(todos);
	}

	@PostMapping("/FinishTask")
	@ResponseBody
	public GenericResponse FinishTask(@RequestBody TempFinishTaskModel model) {
		int rs = 0;

		if (model.getRequest_id() == 0 && model.getAppliedRequest_id() == 0) {
			rs = finishTaskService.finishTaskAsHiredPostTask(model.getPost_id(),
					model.getAppliedRequest_id(), model.getTask_id());
		} else if (model.getPost_id() == 0 && model.getHiredPost_id() == 0) {
			rs = finishTaskService.finishTaskAsAppliedRequestTask(
					model.getRequest_id(), model.getHiredPost_id(),
					model.getTask_id());
		}

		return rs > 0
				? new GenericResponse(true, "Successfully finished task", "200")
				: new GenericResponse(false,
						"Error finishing task in the server", "500");
	}

	@PostMapping("/CancelTask")
	@ResponseBody
	public GenericResponse CancelTask(@RequestBody TempFinishTaskModel model) {
		int rs = 0;

		if (model.getRequest_id() == 0 && model.getAppliedRequest_id() == 0) {
			rs = cancelTaskService.cancelTaskAsHiredPostTask(
					model.getHiredPost_id(), model.getPost_id(),
					model.getTask_id());
		} else if (model.getPost_id() == 0 && model.getHiredPost_id() == 0) {
			rs = cancelTaskService.cancelTaskAsAppliedRequestTask(
					model.getAppliedRequest_id(), model.getRequest_id(),
					model.getTask_id());
		}

		return rs > 0
				? new GenericResponse(true, "Successfully finished task", "200")
				: new GenericResponse(false,
						"Error finishing task in the server", "500");
	}
}
