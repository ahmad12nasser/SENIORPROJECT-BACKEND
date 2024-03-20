package com.project.spring.service.freelancer;

import org.springframework.stereotype.Service;

@Service
public interface ApproveHiredPostService {
	public int approveApplyRequest(int hired_post_id);

}
