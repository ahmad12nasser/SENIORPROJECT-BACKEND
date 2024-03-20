package com.project.spring.dao.freelancer;

import java.util.List;

import com.project.spring.model.NeedClientAccept;

public interface WaitingClientAcceptDao {

	public List<NeedClientAccept> getPendingAppliedRequestsByFreelancerId(
			int freelancer_id);
}
