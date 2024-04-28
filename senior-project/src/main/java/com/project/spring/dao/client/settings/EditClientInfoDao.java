package com.project.spring.dao.client.settings;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Client;

public interface EditClientInfoDao {
	public GenericResponse editClientInfo(Client client);
	public GenericResponse changeProfileImage(Client client);
}
