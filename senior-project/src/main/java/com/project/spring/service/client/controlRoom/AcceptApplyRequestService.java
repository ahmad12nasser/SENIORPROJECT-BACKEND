package com.project.spring.service.client.controlRoom;

import org.springframework.stereotype.Service;

@Service
public interface AcceptApplyRequestService {
	public int acceptApplyRequest(int applied_request_id);
}
