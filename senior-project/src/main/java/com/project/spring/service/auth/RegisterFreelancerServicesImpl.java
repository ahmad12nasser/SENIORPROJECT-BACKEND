package com.project.spring.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.auth.RegisterFreelancerDao;
import com.project.spring.model.Freelancer;

@Component
public class RegisterFreelancerServicesImpl
		implements
			RegisterFreelancerService {

	@Autowired
	private RegisterFreelancerDao freelancerDao;

	@Override
	public int registerFreelancer(Freelancer freelancer) {
		return freelancerDao.registerFreelancer(freelancer);
	}
}
