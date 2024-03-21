package com.project.spring.dao.client.settings;

import java.util.List;

import com.project.spring.model.Client;

public interface ClientInfoDao {
	public List<Client> getClientInfoByCLientId(int client_id);
}
