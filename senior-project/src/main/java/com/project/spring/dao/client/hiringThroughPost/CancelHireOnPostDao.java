package com.project.spring.dao.client.hiringThroughPost;

import org.springframework.stereotype.Component;

import com.project.spring.dao.utils.GenericResponse;

@Component
public interface CancelHireOnPostDao {

	public GenericResponse cancelHireOnPost(int hiredPost_id);
	public GenericResponse resetStatusPostAsPending(String status, int post_id);
}
