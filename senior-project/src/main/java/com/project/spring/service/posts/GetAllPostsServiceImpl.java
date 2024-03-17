package com.project.spring.service.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.posts.GetAllPostsDao;
import com.project.spring.model.Posts;

@Component
public class GetAllPostsServiceImpl implements GetAllPostsService {

	@Autowired
	private GetAllPostsDao getAllPostsDao;

	@Override
	public List<Posts> getAllPostsWithFreelancerInfo() {
		return getAllPostsDao.getAllPostsWithFreelancerInfo();
	}
}
