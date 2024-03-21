package com.project.spring.service.client.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.settings.ClientInfoDao;
import com.project.spring.model.Client;
@Component
public class ClientInfoServiceImpl implements ClientInfoService {

	@Autowired
	private ClientInfoDao clientInfoDao;

	@Override
	public List<Client> getClientInfoByClientId(int client_id) {
		return clientInfoDao.getClientInfoByCLientId(client_id);
	}
}
