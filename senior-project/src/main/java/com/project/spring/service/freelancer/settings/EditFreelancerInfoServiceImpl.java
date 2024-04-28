package com.project.spring.service.freelancer.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.settings.EditFreelancerInfoDao;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Freelancer;

@Component
public class EditFreelancerInfoServiceImpl
		implements
			EditFreelancerInfoService {
	@Autowired
	private EditFreelancerInfoDao editFreelancerInfoDao;

	@Override
	public GenericResponse editFreelancerInfoById(Freelancer freelancer) {
		return editFreelancerInfoDao.editFreelancerInfoById(freelancer);
	}

	@Override
	public GenericResponse changeProfileImage(Freelancer freelancer) {
		return editFreelancerInfoDao.changeProfileImage(freelancer);
	}
}
