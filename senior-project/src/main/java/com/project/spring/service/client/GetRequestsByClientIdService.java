package com.project.spring.service.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.Requests;

@Service
public interface GetRequestsByClientIdService {
	public List<Requests> getRequestsByClientId(int clientId);
}
