package com.project.spring.dao.freelancer.toDo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
@Component
public class CancelTaskDaoImpl implements CancelTaskDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(CancelTaskDaoImpl.class);

	@Override
	public int setStatusAsCanceledInTodoTable(String status, int task_id) {
		try {
			log.debug("Successfully cancelling the task by the freelancer");
			return jdbcTemplate.update(
					Queries.UPDATE_STATUS_IN_TODO_TABLE_FOR_CANCELING, status,
					task_id);
		} catch (Exception e) {
			log.error("Error in cancelTaskByFreelancer() " + e);
			return -1;
		}
	}
	@Override
	public int deleteAppliedRequestFromDataBase(int appliedRequest_id) {
		try {
			log.debug(
					"Successfully deleting the appliedRequest from the database by the appliedRequest_id");
			return jdbcTemplate.update(Queries.DELETE_APPLIED_REQUEST_BY_ID,
					appliedRequest_id);
		} catch (Exception e) {
			log.error("Error in deleteAppliedRequestFromDataBase() " + e);
			return -1;
		}
	}
	@Override
	public int deleteHiredPostFormDataBase(int hiredPost_id) {
		try {
			log.debug(
					"Successfully deleting the hiredPost from the database by the hiredPost_id");
			return jdbcTemplate.update(Queries.DELETE_HIRED_POST_BY_ID,
					hiredPost_id);
		} catch (Exception e) {
			log.error("Error in deleteHiredPostFormDataBase()" + e);
			return -1;
		}
	}
	@Override
	public int setStatusAsPendingInPostsTable(String status, int post_id) {
		try {
			log.debug(
					"Successfully setting the status as pending in the posts table by post_id");
			return jdbcTemplate.update(
					Queries.UPDATE_STATUS_AS_PENDING_IN_POSTS_TABLE, status,
					post_id);
		} catch (Exception e) {
			log.error("Error in setStatusAsPendingInPostsTable() " + e);
			return -1;
		}
	}
	@Override
	public int setStatusAsPendingInRequestsTable(String status,
			int request_id) {
		try {
			log.debug(
					"Successfully setting the status as pending in the requests table by request_id");
			return jdbcTemplate.update(
					Queries.UPDATE_STATUS_AS_PENDING_IN_REQUESTS_TABLE, status,
					request_id);
		} catch (Exception e) {
			log.error("Error in setStatusAsPendingInRequestsTable() " + e);
			return -1;
		}
	}
}
