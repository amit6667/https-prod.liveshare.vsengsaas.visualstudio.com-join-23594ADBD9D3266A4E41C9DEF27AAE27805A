package com.cognixia.lockdown.blog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.lockdown.blog.models.Post;

@RestController
public class PostController {

	List<Post> posts = new ArrayList<Post>();
	
	@GetMapping("/")
	public List<Post> getPosts(){
		return posts;
	}
	
	@PostMapping("/")
	public Post addPost(@RequestBody Post post) {
		posts.add(post);
		return post;
	}
	
}
