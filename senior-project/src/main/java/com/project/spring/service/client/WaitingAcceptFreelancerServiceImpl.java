package com.project.spring.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.WaitingAcceptFreelancerDao;
import com.project.spring.model.HiredPosts;

@Component
public class WaitingAcceptFreelancerServiceImpl
		implements
			WaitingAcceptFreelancerService {

	@Autowired
	private WaitingAcceptFreelancerDao waitingAcceptFreelancerDao;

	@Override
	public List<HiredPosts> getPendingHiredPostsByClientId(int client_id) {
		return waitingAcceptFreelancerDao
				.getPendingHiredPostsByClientId(client_id);
	}
}
