package com.project.spring.service.client.controlRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.controlRoom.AcceptApplyRequestDao;

@Component
public class AcceptApplyRequestServiceImpl
		implements
			AcceptApplyRequestService {
	@Autowired
	private AcceptApplyRequestDao acceptApplyRequestDao;

	@Override
	public int acceptApplyRequest(int applied_request_id) {
		int f1 = 0, f2 = 0;

		f1 = acceptApplyRequestDao.insertIntoToDo("onGoing",
				applied_request_id);
		f2 = acceptApplyRequestDao.updateAppliedRequestsStatus("Accepted",
				applied_request_id);

		return (f1 > 0 && f2 > 0) ? 1 : -1;

	}
}
