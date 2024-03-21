package com.project.spring.service.client.hiringThroughPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.hiringThroughPost.HiringThroughPostDao;

@Component
public class HiringThroughPostServiceImpl implements HiringThroughPostService {

	@Autowired
	private HiringThroughPostDao hiringThroughPostDao;

	@Override
	public int HiringThroughPost(long postId, long freelancerId,
			long clientId) {
		int f1 = 0, f2 = 0;

		f1 = hiringThroughPostDao.insertHiredPost(clientId,
				"Waiting for Acceptance from FreeLancer", postId);

		f2 = hiringThroughPostDao.updatePostStatus(postId, "Hired");

		return (f1 > 0 && f2 > 0) ? 1 : -1;
	}
}
