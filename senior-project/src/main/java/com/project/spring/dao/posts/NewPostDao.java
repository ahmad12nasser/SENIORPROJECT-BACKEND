package com.project.spring.dao.posts;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;

public interface NewPostDao {

   public GenericResponse createPost(Posts posts);

}
