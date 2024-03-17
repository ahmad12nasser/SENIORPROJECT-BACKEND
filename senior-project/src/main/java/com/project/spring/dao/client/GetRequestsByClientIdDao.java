package com.project.spring.dao.client;

import java.util.List;

import com.project.spring.model.Requests;

public interface GetRequestsByClientIdDao {
	
	public List<Requests> getRequestsByClientId(int clientId);
}
