package com.project.spring.dao.client;

public interface AcceptApplyRequestDao {
	public int insertIntoToDo(String status, int applied_request_id);

	public int updateAppliedRequestsStatus(String status,
			int applied_request_id);
}
