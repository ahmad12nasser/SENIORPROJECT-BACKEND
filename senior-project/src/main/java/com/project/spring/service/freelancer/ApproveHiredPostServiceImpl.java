package com.project.spring.service.freelancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.ApproveHiredPostDao;

@Component
public class ApproveHiredPostServiceImpl implements ApproveHiredPostService {
	@Autowired
	private ApproveHiredPostDao approveHiredPostDao;

	@Override
	public int approveApplyRequest(int hired_post_id) {
		int f1 = 0, f2 = 0;

		f1 = approveHiredPostDao.insertIntoToDo("onGoing", hired_post_id);
		f2 = approveHiredPostDao.updateHiredPostStatus("Accepted",
				hired_post_id);

		return (f1 > 0 && f2 > 0) ? 1 : -1;
	}
}
