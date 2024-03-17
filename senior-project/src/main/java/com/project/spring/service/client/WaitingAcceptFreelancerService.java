package com.project.spring.service.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.HiredPosts;

@Service
public interface WaitingAcceptFreelancerService {

	public List<HiredPosts> getPendingHiredPostsByClientId(int client_id);
}
