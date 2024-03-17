package com.project.spring.service.requests;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Requests;

@Service
public interface NewRequestService {
	public GenericResponse createRequest(Requests requests);
}
