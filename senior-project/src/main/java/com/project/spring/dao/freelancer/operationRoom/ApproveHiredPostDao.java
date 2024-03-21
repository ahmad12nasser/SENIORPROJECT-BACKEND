package com.project.spring.dao.freelancer.operationRoom;

public interface ApproveHiredPostDao {

	public int insertIntoToDo(String status, int hired_post_id);
	public int updateHiredPostStatus(String status, int hired_post_id);
}
