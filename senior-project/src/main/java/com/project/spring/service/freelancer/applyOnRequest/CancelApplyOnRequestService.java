package com.project.spring.service.freelancer.applyOnRequest;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;

@Service
public interface CancelApplyOnRequestService {

	public GenericResponse cancelApplyOnRequest(int request_id,
			int appliedRequest_id);
}
