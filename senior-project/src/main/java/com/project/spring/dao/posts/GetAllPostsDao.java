package com.project.spring.dao.posts;

import java.util.List;

import com.project.spring.model.Posts;

public interface GetAllPostsDao {
	public List<Posts> getAllPostsWithFreelancerInfo();
}
