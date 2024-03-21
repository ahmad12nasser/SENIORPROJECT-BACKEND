package com.project.spring.dao.client.controlRoom;

import java.util.List;

import com.project.spring.model.HiredPosts;

public interface WaitingAcceptFreelancerDao {
	public List<HiredPosts> getPendingHiredPostsByClientId(int client_id);
}
