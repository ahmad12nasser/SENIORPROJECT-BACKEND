package com.project.spring.dao.requests;

import java.util.List;

import com.project.spring.model.Requests;

public interface RequestsDao {

	List<Requests> getAllRequestsWithClientInfo();
}
