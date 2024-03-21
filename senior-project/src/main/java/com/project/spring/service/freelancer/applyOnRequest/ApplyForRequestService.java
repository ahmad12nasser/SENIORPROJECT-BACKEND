package com.project.spring.service.freelancer.applyOnRequest;

import org.springframework.stereotype.Service;

@Service
public interface ApplyForRequestService {
	public int applyForRequest(long requestId, long clientId,
			long freelancerId);
}
