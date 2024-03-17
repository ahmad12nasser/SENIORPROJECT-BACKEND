package com.project.spring.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.GetRequestsByClientIdDao;
import com.project.spring.model.Requests;

@Component
public class GetRequestsByClientIdServiceImpl
		implements
			GetRequestsByClientIdService {

	@Autowired
	private GetRequestsByClientIdDao getRequestsByClientIdDao;

	@Override
	public List<Requests> getRequestsByClientId(int clientId) {
		return getRequestsByClientIdDao.getRequestsByClientId(clientId);
	}
}
