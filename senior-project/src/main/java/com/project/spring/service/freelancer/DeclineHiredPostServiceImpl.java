package com.project.spring.service.freelancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.DeclineHiredPostDao;

@Component
public class DeclineHiredPostServiceImpl implements DeclineHiredPostService {
	@Autowired
	private DeclineHiredPostDao declineHiredPostDao;

	@Override
	public int declineHiredPost(int hired_post_id) {
		int f = 0;
		f = declineHiredPostDao.declineHiredPost("Rejected", hired_post_id);
		return (f > 0) ? 1 : -1;
	}
}
