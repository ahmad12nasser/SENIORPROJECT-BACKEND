package com.project.spring.service.requests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.requests.NewRequestDao;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Requests;

@Component
public class NewRequestServiceImpl implements NewRequestService {
	@Autowired
	private NewRequestDao newRequestDao;

	@Override
	public GenericResponse createRequest(Requests requests) {
		return newRequestDao.createRequest(requests);
	}
}
