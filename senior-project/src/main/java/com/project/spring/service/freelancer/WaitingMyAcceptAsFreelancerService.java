package com.project.spring.service.freelancer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.HiredPostsWithFreelancerId;

@Service
public interface WaitingMyAcceptAsFreelancerService {

	public List<HiredPostsWithFreelancerId> getPendingHiredPostsByFreelancerId(
			int freelancer_id);
}
