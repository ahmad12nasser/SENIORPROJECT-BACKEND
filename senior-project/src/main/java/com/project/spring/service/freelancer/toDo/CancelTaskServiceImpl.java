package com.project.spring.service.freelancer.toDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.toDo.CancelTaskDao;

@Component
public class CancelTaskServiceImpl implements CancelTaskService {
	@Autowired
	private CancelTaskDao cancelTaskDao;
	@Override
	public int cancelTaskAsAppliedRequestTask(int appliedRequest_id,
			int request_id, int task_id) {
		int n1 = 0, n2 = 0, n3 = 0;
		n1 = cancelTaskDao.setStatusAsCanceledInTodoTable("Canceled", task_id);
		n2 = cancelTaskDao.deleteAppliedRequestFromDataBase(appliedRequest_id);
		n3 = cancelTaskDao.setStatusAsPendingInRequestsTable("Pending",
				request_id);

		return (n1 > 0 && n2 > 0 && n3 > 0) ? 1 : -1;

	}
	@Override
	public int cancelTaskAsHiredPostTask(int hiredPost_id, int post_id,
			int task_id) {
		int n1 = 0, n2 = 0, n3 = 0;
		n1 = cancelTaskDao.setStatusAsCanceledInTodoTable("Canceled", task_id);
		n2 = cancelTaskDao.deleteHiredPostFormDataBase(hiredPost_id);
		n3 = cancelTaskDao.setStatusAsPendingInPostsTable("Pending", post_id);

		return (n1 > 0 && n2 > 0 && n3 > 0) ? 1 : -1;
	}
}
