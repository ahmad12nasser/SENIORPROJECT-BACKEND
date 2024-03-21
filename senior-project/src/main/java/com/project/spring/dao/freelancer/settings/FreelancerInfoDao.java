package com.project.spring.dao.freelancer.settings;

import java.util.List;

import com.project.spring.model.Freelancer;

public interface FreelancerInfoDao {

	public List<Freelancer> getFreelancerById(int freelancer_id);

}
