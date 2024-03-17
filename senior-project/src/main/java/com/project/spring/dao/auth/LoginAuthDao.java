package com.project.spring.dao.auth;

import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;

public interface LoginAuthDao {

	public int isClient(Client client);

	public int isFreelancer(Freelancer freelancer);
}
