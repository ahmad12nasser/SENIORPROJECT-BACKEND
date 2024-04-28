package com.project.spring.service.client.hiringThroughPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.hiringThroughPost.CancelHireOnPostDao;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class CancelHireOnPostServiceImpl implements CancelHireOnPostService {

	@Autowired
	private CancelHireOnPostDao cancelHireOnPostDao;

	@Override
	public GenericResponse cancelHireOnPost(int post_id, int hiredPost_id) {
		GenericResponse n1 = null, n2 = null;

		n1 = cancelHireOnPostDao.cancelHireOnPost(hiredPost_id);
		n2 = cancelHireOnPostDao.resetStatusPostAsPending("Pending", post_id);

		return (n1 != null && n2 != null)
				? new GenericResponse(true,
						"successfully canceling the hire on the post", "200")
				: new GenericResponse(false,
						"Error in cancelling the hire on the post", "500");
	}

}
