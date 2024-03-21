package com.project.spring.dao.freelancer.operationRoom;

import java.util.List;

import com.project.spring.model.HiredPostsWithFreelancerId;

public interface WaitingMyAcceptAsFreelancerDao {
	public List<HiredPostsWithFreelancerId> getPendingHiredPostsByFreelancerId(
			int freelancer_id);
}
