package com.project.spring.service.freelancer;

import org.springframework.stereotype.Service;

@Service
public interface DeclineHiredPostService {
	public int declineHiredPost(int hired_post_id);
}
