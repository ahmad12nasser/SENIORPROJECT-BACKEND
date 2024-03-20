package com.project.spring.service.freelancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.WaitingMyAcceptAsFreelancerDao;
import com.project.spring.model.HiredPostsWithFreelancerId;

@Component
public class WaitingMyAcceptAsFreelancerServiceImpl implements WaitingMyAcceptAsFreelancerService {
	@Autowired
	private WaitingMyAcceptAsFreelancerDao waitingMyAcceptAsFreelancerDao;

	@Override
	public List<HiredPostsWithFreelancerId> getPendingHiredPostsByFreelancerId(
			int freelancer_id) {
		return waitingMyAcceptAsFreelancerDao
				.getPendingHiredPostsByFreelancerId(freelancer_id);
	}
}
