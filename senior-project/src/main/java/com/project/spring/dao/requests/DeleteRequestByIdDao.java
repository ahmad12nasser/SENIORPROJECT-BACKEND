package com.project.spring.dao.requests;

import org.springframework.stereotype.Component;

import com.project.spring.dao.utils.GenericResponse;
@Component
public interface DeleteRequestByIdDao {

	public GenericResponse deleteRequestById(int request_id);
}
