package com.project.spring.controller.mutualControllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Posts;
import com.project.spring.service.posts.DeletePostByIdService;
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
	@Autowired
	private DeletePostByIdService deletePostByIdService;

	@PostMapping("/createPost")
	@ResponseBody
	public GenericResponse createPost(
			@RequestParam(value = "freelancer_id", required = true) int freelancer_id,
			@RequestParam(value = "image", required = false) MultipartFile image,
			@RequestParam(value = "title", required = true) String title,
			@RequestParam(value = "deadline", required = true) Date deadline,
			@RequestParam(value = "location", required = true) String location,
			@RequestParam(value = "categ_name", required = true) String categ_name,
			@RequestParam(value = "description", required = true) String description,
			@RequestParam(value = "price", required = true) BigDecimal price)
			throws IOException {

		Posts posts = new Posts();
		if (image != null && !image.isEmpty()) {
			posts.setImage(image.getBytes());
		}
		posts.setFreelancerId(freelancer_id);
		posts.setTitle(title);
		posts.setDeadline(deadline);
		posts.setLocation(location);
		posts.setCategName(categ_name);
		posts.setDescription(description);
		posts.setPrice(price);
		return newPostService.createPost(posts);
	}
	@PostMapping("/getMyPosts/{freelancerId}")
	@ResponseBody
	public List<Posts> getMyPosts(@PathVariable int freelancerId,
			HttpServletRequest req) throws ParseException {
		return getPostService.getPostsByFreelancerId(freelancerId);
	}

	@PostMapping("/getAllPosts")
	@ResponseBody
	public List<Posts> getAllPostsWithFreelancerInfo(HttpServletRequest req)
			throws ParseException {
		return getAllPostsService.getAllPostsWithFreelancerInfo();
	}

	@PostMapping("/deletePostById/{post_id}")
	@ResponseBody
	public GenericResponse deletePostById(@PathVariable int post_id) {
		return deletePostByIdService.deletePostById(post_id);
	}
}
