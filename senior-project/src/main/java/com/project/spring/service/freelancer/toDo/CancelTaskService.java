package com.project.spring.service.freelancer.toDo;

import org.springframework.stereotype.Service;

@Service
public interface CancelTaskService {
	public int cancelTaskAsHiredPostTask(int hiredPost_id, int post_id,
			int task_id);
	public int cancelTaskAsAppliedRequestTask(int appliedRequest_id,
			int request_id, int task_id);
}
