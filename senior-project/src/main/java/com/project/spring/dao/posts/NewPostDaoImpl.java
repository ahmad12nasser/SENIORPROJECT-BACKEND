package com.project.spring.dao.posts;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;
@Component
public class NewPostDaoImpl implements NewPostDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(NewPostDaoImpl.class);

	@Override
	public GenericResponse createPost(Posts posts) {
		try {

			jdbcTemplate.update(Queries.CREATE_POST,
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps)
								throws SQLException {
							int i = 0;
							ps.setLong(++i, posts.getFreelancerId());
							ps.setString(++i, posts.getTitle());
							ps.setDate(++i, posts.getDatePosted());
							ps.setDate(++i, posts.getDeadline());
							ps.setString(++i, posts.getLocation());
							ps.setString(++i, posts.getCategName());
							ps.setString(++i, posts.getDescription());
							ps.setBytes(++i, posts.getImage());
						}
					});
			log.debug(
					"Succesfully creating a post and adding it to the posts table in the database");
			return new GenericResponse(true, "Post created successfully",
					"200");
		} catch (Exception e) {
			log.error("Error in createPost() " + e);
			return new GenericResponse(false, "Error creating post", "500");
		}
	}
}
