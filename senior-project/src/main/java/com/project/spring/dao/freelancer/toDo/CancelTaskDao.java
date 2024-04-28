package com.project.spring.dao.freelancer.toDo;

import org.springframework.stereotype.Component;

@Component
public interface CancelTaskDao {
	public int setStatusAsCanceledInTodoTable(String status, int task_id);
	public int deleteAppliedRequestFromDataBase(int appliedRequest_id);
	public int deleteHiredPostFormDataBase(int hiredPost_id);
	public int setStatusAsPendingInPostsTable(String status, int post_id);
	public int setStatusAsPendingInRequestsTable(String status, int request_id);
}
