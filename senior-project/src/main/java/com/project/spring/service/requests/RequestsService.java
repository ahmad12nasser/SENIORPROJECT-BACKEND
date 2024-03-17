package com.project.spring.service.requests;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.Requests;
@Service
public interface RequestsService {

	List<Requests> getAllRequestsWithClientInfo();
}
