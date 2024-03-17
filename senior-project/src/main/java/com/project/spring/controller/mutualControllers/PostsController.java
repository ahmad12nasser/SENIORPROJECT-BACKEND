package com.project.spring.controller.mutualControllers;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;
import com.project.spring.service.posts.GetAllPostsService;
import com.project.spring.service.posts.GetPostService;
import com.project.spring.service.posts.NewPostService;

@RestController
@RequestMapping("/posts")
public class PostsController {

	@Autowired
	private NewPostService newPostService;
	@Autowired
	private GetPostService getPostService;
	@Autowired
	private GetAllPostsService getAllPostsService;
	
	@PostMapping("/createPost")
	@ResponseBody
	public GenericResponse createPost(@RequestBody Posts posts) {

		return newPostService.createPost(posts);
	}
	@PostMapping("/getMyPosts/{freelancerId}")
	@ResponseBody
	public List<Posts> getMyPosts(@PathVariable int freelancerId, HttpServletRequest req) throws ParseException {
		return getPostService.getPostsByFreelancerId(freelancerId);
	}
	
	@PostMapping("/getAllPosts")
	@ResponseBody
	public List<Posts> getAllPostsWithFreelancerInfo(HttpServletRequest req) throws ParseException{
		return getAllPostsService.getAllPostsWithFreelancerInfo();
	}
}
