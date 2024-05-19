package com.project.spring.dao.freelancer.toDo;

import org.springframework.stereotype.Component;

@Component
public interface FinishTaskDao {
	public int insertIntoFinishTasksTable(int task_id);
	public int updateStatusInToDoTable(String status, int task_id);
	public int deleteAppliedRequestFromAppliedRequestsTable(int requuest_id);
	public int deleteRequestFromRequestsTable(int request_id);
	public int updateStatusInHiredPostTable(String status, int post_id);
	public int setStatusInPostTableAsPending(String status, int post_id);
}
