package com.project.spring.service.freelancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.WaitingClientAcceptDao;
import com.project.spring.model.NeedClientAccept;

@Component
public class WaitingClientAcceptServiceImpl
		implements
			WaitingClientAcceptService {
	@Autowired
	private WaitingClientAcceptDao waitingClientAcceptDao;

	@Override
	public List<NeedClientAccept> getPendingAppliedRequestsByFreelancerId(
			int freelancer_id) {
		return waitingClientAcceptDao
				.getPendingAppliedRequestsByFreelancerId(freelancer_id);
	}
}
