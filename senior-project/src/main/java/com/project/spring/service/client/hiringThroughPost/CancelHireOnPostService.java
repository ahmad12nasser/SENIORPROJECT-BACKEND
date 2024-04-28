package com.project.spring.service.client.hiringThroughPost;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;

@Service
public interface CancelHireOnPostService {

	public GenericResponse cancelHireOnPost(int post_id, int hiredPost_id);
}
