package com.project.spring.service.client.controlRoom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.client.controlRoom.WaitingMyAcceptAsClientDao;
import com.project.spring.model.NeedClientAccept;

@Component
public class WaitingMyAcceptAsClientServiceImpl
		implements
			WaitingMyAcceptAsClientService {

	@Autowired
	private WaitingMyAcceptAsClientDao waitingMyAcceptAsClientDao;

	@Override
	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id) {
		return waitingMyAcceptAsClientDao
				.getPendingAppliedRequestsByclientId(client_id);
	}
}
