package com.project.spring.service.posts;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;

@Service
public interface DeletePostByIdService {

	public GenericResponse deletePostById(int post_id);
}
