package com.project.spring.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.WaitingMyAcceptDao;
import com.project.spring.model.NeedClientAccept;

@Component
public class WaitingMyAcceptServiceImpl implements WaitingMyAcceptService {

	@Autowired
	private WaitingMyAcceptDao waitingMyAcceptDao;

	@Override
	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id) {
		return waitingMyAcceptDao
				.getPendingAppliedRequestsByclientId(client_id);
	}
}
