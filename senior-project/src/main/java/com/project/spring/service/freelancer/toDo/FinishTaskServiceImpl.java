package com.project.spring.service.freelancer.toDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.toDo.FinishTaskDao;
@Component
public class FinishTaskServiceImpl implements FinishTaskService {

	@Autowired
	private FinishTaskDao finishTaskDao;

	@Override
	public int finishTaskAsAppliedRequestTask(int request_id,
			int appliedRequest_id, int task_id) {
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0;

		f1 = finishTaskDao.insertIntoFinishTasksTable(task_id);
		f2 = finishTaskDao.updateStatusInToDoTable("Finished" + "", task_id);
		f3 = finishTaskDao
				.deleteAppliedRequestFromAppliedRequestsTable(request_id);
		f4 = finishTaskDao.deleteRequestFromRequestsTable(request_id);
		return (f1 > 0 && f2 > 0 && f3 > 0 && f4 > 0) ? 1 : -1;
	}
	@Override
	public int finishTaskAsHiredPostTask(int post_id, int hiredPost_id,
			int task_id) {
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0;
		f1 = finishTaskDao.insertIntoFinishTasksTable(task_id);
		f2 = finishTaskDao.updateStatusInToDoTable("Finished", task_id);
		f3 = finishTaskDao.updateStatusInHiredPostTable("Finished", post_id);
		f4 = finishTaskDao.setStatusInPostTableAsPending("Pending", post_id);
		return (f1 > 0 && f2 > 0 && f3 > 0 && f4 > 0) ? 1 : -1;
	}
}
