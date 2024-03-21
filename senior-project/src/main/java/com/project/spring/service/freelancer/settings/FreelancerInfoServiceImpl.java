package com.project.spring.service.freelancer.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.settings.FreelancerInfoDao;
import com.project.spring.model.Freelancer;

@Component
public class FreelancerInfoServiceImpl implements FreelancerInfoService {

	@Autowired
	private FreelancerInfoDao freelancerInfoDao;

	@Override
	public List<Freelancer> getFreelancerById(int freelancer_id) {
		return freelancerInfoDao.getFreelancerById(freelancer_id);
	}
}
