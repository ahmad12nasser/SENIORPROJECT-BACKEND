package com.project.spring.service.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.posts.GetPostsByFreelancerIdDao;
import com.project.spring.model.Posts;

@Component
public class GetPostServiceImpl implements GetPostService {

	@Autowired
	private GetPostsByFreelancerIdDao getPostsByFreelancerIdDao;

	@Override
	public List<Posts> getPostsByFreelancerId(int freelancerId) {
		return getPostsByFreelancerIdDao.getPostsByFreelancerId(freelancerId);
	}
}
