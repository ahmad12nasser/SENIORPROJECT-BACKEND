package com.project.spring.dao.freelancer;

public interface ApplyForRequestDao {
	public int updateRequestStatus(long requestId, String status);

	public int insertAppliedRequest(long freelancerId, String status,
			long requestId);
}
