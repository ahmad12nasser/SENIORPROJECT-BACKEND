package com.project.spring.dao.posts;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Posts;
import com.project.spring.model.rm.GetPostsByFreelancerIdRowMapper;

@Component
public class GetPostsByFreelancerIdDaoImpl
		implements
			GetPostsByFreelancerIdDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Logger log = LogManager
			.getLogger(GetPostsByFreelancerIdDaoImpl.class);

	@Override
	public List<Posts> getPostsByFreelancerId(int freelancerId) {
		try {

			return jdbcTemplate.query(Queries.GET_POSTS_BY_ID,
					new Object[]{freelancerId},
					new GetPostsByFreelancerIdRowMapper());
		} catch (Exception e) {
			log.error(
					"An error occurred while retrieving posts from the database",
					e);
			return null;
		}
	}
}
