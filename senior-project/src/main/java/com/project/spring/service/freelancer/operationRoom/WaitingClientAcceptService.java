package com.project.spring.service.freelancer.operationRoom;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.NeedClientAccept;

@Service
public interface WaitingClientAcceptService {
	public List<NeedClientAccept> getPendingAppliedRequestsByFreelancerId(
			int freelancer_id);
}
