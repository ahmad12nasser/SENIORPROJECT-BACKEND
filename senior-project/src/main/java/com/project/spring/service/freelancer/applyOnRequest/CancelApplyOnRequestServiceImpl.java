package com.project.spring.service.freelancer.applyOnRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.applyOnRequest.CancelApplyOnRequestDao;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class CancelApplyOnRequestServiceImpl
		implements
			CancelApplyOnRequestService {

	@Autowired
	private CancelApplyOnRequestDao cancelApplyOnRequestDao;

	@Override
	public GenericResponse cancelApplyOnRequest(int appliedRequest_id,
			int request_id) {
		GenericResponse n1 = null, n2 = null;

		n1 = cancelApplyOnRequestDao.cancelApplyOnRequest(appliedRequest_id);

		n2 = cancelApplyOnRequestDao.resetStatusRequestAsPending("Pending",
				request_id);

		return (n1 != null && n2 != null)
				? new GenericResponse(true,
						"successfully canceling the apply on the request",
						"200")
				: new GenericResponse(false,
						"Error in cancelling the apply on the request", "500");

	}

}
