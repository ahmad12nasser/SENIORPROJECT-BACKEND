package com.project.spring.service.client;

import org.springframework.stereotype.Service;

@Service
public interface HiringThroughPostService {
	public int HiringThroughPost(long postId, long freelancerId, long clientId);
}
