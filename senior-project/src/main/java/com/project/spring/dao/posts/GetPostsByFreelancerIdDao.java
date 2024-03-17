package com.project.spring.dao.posts;

import com.project.spring.model.Posts;

import java.util.List;

public interface GetPostsByFreelancerIdDao {
    List<Posts> getPostsByFreelancerId(int freelancerId);
}
