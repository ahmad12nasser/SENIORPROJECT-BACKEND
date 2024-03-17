package com.project.spring.dao.requests;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Requests;

public interface NewRequestDao {
	public GenericResponse createRequest(Requests requests);
}
