package com.project.spring.dao.posts;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class NewPostDaoImpl implements NewPostDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public GenericResponse createPost(Posts posts) {
		try {
			jdbcTemplate.update(Queries.CREATE_POST, posts.getFreelancerId(),
					posts.getTitle(), posts.getDatePosted(),
					posts.getDeadline(), posts.getLocation(),
					posts.getCategName(), posts.getDescription(),
					posts.getImage(), posts.getPrice());

			return new GenericResponse(true, "Post created successfully",
					"200");
		} catch (Exception e) {
			e.printStackTrace();
			return new GenericResponse(false, "Error creating post", "500");
		}
	}
}
