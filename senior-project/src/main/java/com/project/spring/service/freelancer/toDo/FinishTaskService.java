package com.project.spring.service.freelancer.toDo;

import org.springframework.stereotype.Service;

@Service
public interface FinishTaskService {
	public int finishTaskAsHiredPostTask(int post_id, int hiredPost_id,
			int task_id);
	public int finishTaskAsAppliedRequestTask(int request_id,
			int appliedRequest_id, int task_id);
}
