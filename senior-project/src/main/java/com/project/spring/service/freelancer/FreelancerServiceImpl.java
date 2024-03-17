package com.project.spring.service.freelancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.FreelancerDao;
import com.project.spring.model.Freelancer;

@Component
public class FreelancerServiceImpl implements FreelancerService {

	@Autowired
	private FreelancerDao freelancerDao;

	@Override
	public Freelancer getFreelancerById(int freelancer_id) {
		return freelancerDao.getFreelancerById(freelancer_id);
	}
}
