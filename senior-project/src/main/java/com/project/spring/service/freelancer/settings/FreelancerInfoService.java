package com.project.spring.service.freelancer.settings;

import java.util.List;

import com.project.spring.model.Freelancer;

public interface FreelancerInfoService {

	public List<Freelancer> getFreelancerById(int freelancer_id);
}
