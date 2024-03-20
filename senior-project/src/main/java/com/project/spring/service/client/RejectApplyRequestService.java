package com.project.spring.service.client;

import org.springframework.stereotype.Service;

@Service
public interface RejectApplyRequestService {
	public int rejectApplyRequest(int applied_request_id);
}
