package com.project.spring.service.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.posts.NewPostDao;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;

@Component
public class NewPostServiceImpl implements NewPostService {

	@Autowired
	private NewPostDao newPostDao;

	@Override
	public GenericResponse createPost(Posts posts) {
		return newPostDao.createPost(posts);
	}
}
