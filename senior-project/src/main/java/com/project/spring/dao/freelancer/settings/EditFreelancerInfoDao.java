package com.project.spring.dao.freelancer.settings;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Freelancer;

public interface EditFreelancerInfoDao {
	public GenericResponse editFreelancerInfoById(Freelancer freelancer);
	public GenericResponse changeProfileImage(Freelancer freelancer);
}
