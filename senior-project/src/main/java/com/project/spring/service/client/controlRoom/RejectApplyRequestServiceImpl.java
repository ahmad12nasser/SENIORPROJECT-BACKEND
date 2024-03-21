package com.project.spring.service.client.controlRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.controlRoom.RejectApplyRequestDao;

@Component
public class RejectApplyRequestServiceImpl
		implements
			RejectApplyRequestService {
	@Autowired
	private RejectApplyRequestDao applyRequestDao;

	@Override
	public int rejectApplyRequest(int applied_request_id) {
		int f = 0;
		f = applyRequestDao.rejectApplyRequest("Rejected", applied_request_id);
		return (f > 0) ? 1 : -1;
	}
}
