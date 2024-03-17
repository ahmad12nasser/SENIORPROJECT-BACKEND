package com.project.spring.service.freelancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.ApplyForRequestDao;

@Component
public class ApplyForRequestServiceImpl implements ApplyForRequestService {

	@Autowired
	private ApplyForRequestDao applyForRequestDao;
	@Override
	public int applyForRequest(long requestId, long clientId,
			long freelancerId) {

		int m = 0, n = 0;

		m = applyForRequestDao.insertAppliedRequest(freelancerId,
				"Waiting for Acceptance from Client", requestId);

		n = applyForRequestDao.updateRequestStatus(requestId, "Applied");

		return (m > 0 && n > 0) ? 1 : -1;
	}
}
