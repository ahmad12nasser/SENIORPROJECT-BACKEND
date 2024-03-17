package com.project.spring.service.posts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.Posts;

@Service
public interface GetPostService {
	
	List<Posts> getPostsByFreelancerId(int freelancerId);

}
