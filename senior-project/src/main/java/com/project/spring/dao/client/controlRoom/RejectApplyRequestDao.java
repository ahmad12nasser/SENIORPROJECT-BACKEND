package com.project.spring.dao.client.controlRoom;

public interface RejectApplyRequestDao {

	public int rejectApplyRequest(String status, int applied_request_id);
}
