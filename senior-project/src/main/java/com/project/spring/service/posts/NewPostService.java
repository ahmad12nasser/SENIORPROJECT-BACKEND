package com.project.spring.service.posts;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;

@Service
public interface NewPostService {

	public GenericResponse createPost(Posts posts);

}
