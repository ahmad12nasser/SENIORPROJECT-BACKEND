package com.project.spring.dao.posts;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Posts;
import com.project.spring.model.rm.PostWithFreelancerInfoRowMapper;

@Component
public class GetAllPostsDaoImpl implements GetAllPostsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Logger log = LogManager.getLogger(GetAllPostsDaoImpl.class);

	@Override
	public List<Posts> getAllPostsWithFreelancerInfo() {
		try {
			return jdbcTemplate.query(Queries.GET_ALL_POSTS,
					new PostWithFreelancerInfoRowMapper());
		} catch (Exception e) {
			log.error("Error in getAllPostsWithFreelancerInfo " + e);
			return null;
		}
	}
}
