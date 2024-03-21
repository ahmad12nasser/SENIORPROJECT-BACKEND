package com.project.spring.service.client.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.settings.EditClientInfoDao;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Client;

@Component
public class EditClientInfoServiceImpl implements EditClientInfoService {
	@Autowired
	private EditClientInfoDao editClientInfoDao;

	@Override
	public GenericResponse editClientInfoById(Client client) {
		return editClientInfoDao.editClientInfo(client);
	}
}
