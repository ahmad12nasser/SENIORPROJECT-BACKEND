package com.project.spring.dao.freelancer.applyOnRequest;

import org.springframework.stereotype.Component;

import com.project.spring.dao.utils.GenericResponse;

@Component
public interface CancelApplyOnRequestDao {

	public GenericResponse cancelApplyOnRequest(int appliedRequest_id);
	public GenericResponse resetStatusRequestAsPending(String status,
			int request_id);
}
