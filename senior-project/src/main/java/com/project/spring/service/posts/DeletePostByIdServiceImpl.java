package com.project.spring.service.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.posts.DeletePostByIdDao;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class DeletePostByIdServiceImpl implements DeletePostByIdService {

	@Autowired
	private DeletePostByIdDao deletePostByIdDao;

	@Override
	public GenericResponse deletePostById(int post_id) {
		return deletePostByIdDao.deletePostById(post_id);
	}
}
