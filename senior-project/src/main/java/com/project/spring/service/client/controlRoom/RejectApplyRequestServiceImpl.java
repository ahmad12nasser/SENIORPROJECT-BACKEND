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
	public int rejectApplyRequest(int applied_request_id, int request_id) {
		int f1 = 0, f2 = 0;
		f1 = applyRequestDao.rejectApplyRequest("Rejected", applied_request_id);
		f2 = applyRequestDao.setTheStatusOfRequestAsPending("Pending",
				request_id);
		return (f1 > 0 && f2 > 0) ? 1 : -1;
	}

}
