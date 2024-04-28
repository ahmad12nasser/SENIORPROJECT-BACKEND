package com.project.spring.service.requests;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;
@Service
public interface DeleteRequestByIdService {

	public GenericResponse deleteRequestById(int request_id);
}
