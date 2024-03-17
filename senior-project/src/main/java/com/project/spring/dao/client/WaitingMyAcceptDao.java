package com.project.spring.dao.client;

import java.util.List;

import com.project.spring.model.NeedClientAccept;

public interface WaitingMyAcceptDao {

	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id);

}
