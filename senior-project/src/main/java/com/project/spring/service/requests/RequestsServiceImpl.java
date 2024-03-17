package com.project.spring.service.requests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.requests.RequestsDao;
import com.project.spring.model.Requests;
@Component
public class RequestsServiceImpl implements RequestsService{

	@Autowired
	private RequestsDao RequestsDao;
	@Override
	public List<Requests> getAllRequestsWithClientInfo() {
		return RequestsDao.getAllRequestsWithClientInfo();
	}
}
