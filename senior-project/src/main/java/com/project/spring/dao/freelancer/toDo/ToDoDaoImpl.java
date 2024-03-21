package com.project.spring.dao.freelancer.toDo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.ToDo;
import com.project.spring.model.rm.ToDoRowMapper;
@Component
public class ToDoDaoImpl implements ToDoDao {

	private final static Logger log = LogManager.getLogger(ToDoDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ToDo> getAllToDos(int freelancerId) {
		try {
			log.debug("getAllToDos function");
			return jdbcTemplate.query(Queries.GET_ALL_JOBS_BY_FREELANCER_ID,
					new Object[]{freelancerId}, new ToDoRowMapper());
		} catch (Exception e) {
			log.error("error in getAllToDos " + e);
			return null;
		}
	}
}
