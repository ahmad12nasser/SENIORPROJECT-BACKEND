package com.project.spring.dao.freelancer.toDo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
@Component
public class FinishTaskDaoImpl implements FinishTaskDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(FinishTaskDaoImpl.class);

	@Override
	public int insertIntoFinishTasksTable(int task_id) {
		try {
			log.debug(
					"Successfully adding the finished task into the FinishedTask table in the database");
			return jdbcTemplate.update(
					Queries.INSERT_FINISHED_TASKS_INTO_FINISHED_TASKS_TABLE,
					task_id);
		} catch (Exception e) {
			log.error("Error in insertIntoFinishTasksTable() " + e);
			return -1;
		}
	}
	@Override
	public int updateStatusInToDoTable(String status, int task_id) {
		try {
			log.debug("Successfully update the status in the toDo table");
			return jdbcTemplate.update(Queries.UPDATE_STATUS_IN_TODO_TABLE,
					status, task_id);
		} catch (Exception e) {
			log.error("Error in updateStatusInToDoTable() " + e);
			return -1;
		}
	}
	@Override
	public int deleteHiredPostFromHiredPostTable(int hiredPost_id) {
		try {
			log.debug(
					"Successfully delete the hiredPost from the hired_posts table");
			return jdbcTemplate.update(Queries.DELETE_HIRED_POST_BY_POST_ID,
					hiredPost_id);
		} catch (Exception e) {
			log.error("Error in deleteHiredPostFromHiredPostTable() " + e);
			return -1;
		}
	}
	@Override
	public int setStatusInPostTableAsPending(String status, int post_id) {
		try {
			log.debug(
					"Successfully updating the post table status to be as pending");
			return jdbcTemplate.update(
					Queries.UPDATE_STATUS_AS_PENDING_IN_POSTS_TABLE, status,
					post_id);
		} catch (Exception e) {
			log.error("Error in setStatusInPostTableAsPending() " + e);
			return -1;
		}
	}
	@Override
	public int deleteRequestFromRequestsTable(int request_id) {
		try {
			log.debug(
					"Successfully delete the request from the Requests table by request_id");
			return jdbcTemplate.update(Queries.DELETE_REQUEST_BY_REQUEST_ID,
					request_id);
		} catch (Exception e) {
			log.error("Error in deleteRequestFromRequestsTable() " + e);
			return -1;
		}
	}
	@Override
	public int deleteAppliedRequestFromAppliedRequestsTable(
			int appliedRequest_id) {
		try {
			log.debug(
					"Successfully delete the appliedRequest from the applied_requests table");
			return jdbcTemplate.update(
					Queries.DELETE_APPLIED_REQUEST_BY_REQUEST_ID,
					appliedRequest_id);
		} catch (Exception e) {
			log.error("Error in deleteAppliedRequestFromAppliedRequestsTable() "
					+ e);
			return -1;
		}
	}
}
