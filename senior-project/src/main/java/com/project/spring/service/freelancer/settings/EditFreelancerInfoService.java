package com.project.spring.service.freelancer.settings;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Freelancer;

@Service
public interface EditFreelancerInfoService {
	public GenericResponse editFreelancerInfoById(Freelancer freelancer);
	public GenericResponse changeProfileImage(Freelancer freelancer);
}
