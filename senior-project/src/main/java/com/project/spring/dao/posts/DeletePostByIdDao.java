package com.project.spring.dao.posts;

import org.springframework.stereotype.Component;

import com.project.spring.dao.utils.GenericResponse;
@Component
public interface DeletePostByIdDao {
	public GenericResponse deletePostById(int post_id);
}
