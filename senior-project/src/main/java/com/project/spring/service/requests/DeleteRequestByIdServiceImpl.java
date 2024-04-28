package com.project.spring.service.requests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.requests.DeleteRequestByIdDao;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class DeleteRequestByIdServiceImpl implements DeleteRequestByIdService {

	@Autowired
	private DeleteRequestByIdDao deleteRequestByIdDao;

	@Override
	public GenericResponse deleteRequestById(int request_id) {
		return deleteRequestByIdDao.deleteRequestById(request_id);
	}
}
