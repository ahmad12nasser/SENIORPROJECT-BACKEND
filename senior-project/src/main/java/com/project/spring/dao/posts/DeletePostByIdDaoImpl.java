package com.project.spring.dao.posts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
@Component
public class DeletePostByIdDaoImpl implements DeletePostByIdDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(DeletePostByIdDaoImpl.class);

	@Override
	public GenericResponse deletePostById(int post_id) {

		try {
			jdbcTemplate.update(Queries.DELETE_POST_BY_POST_ID, post_id);
			log.debug(
					"Successfully delete post with" + post_id + " as post_id");
			return new GenericResponse(true,
					"Successfully delete post by " + post_id + " as post_id",
					"200");
		} catch (Exception e) {
			log.error("Error with deleting post in deletePostById() " + e);
			return new GenericResponse(false,
					"Error in the internal server during deleting the post",
					"500");
		}
	}
}
