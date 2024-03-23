package com.project.spring.dao.auth;

import java.util.List;

import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;
import com.project.spring.model.LoginResponse;

public interface LoginAuthDao {

	public List<LoginResponse> isClient(Client client);

	public List<LoginResponse> isFreelancer(Freelancer freelancer);
}
