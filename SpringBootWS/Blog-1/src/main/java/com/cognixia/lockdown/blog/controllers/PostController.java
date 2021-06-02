package com.cognixia.lockdown.blog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.lockdown.blog.models.Post;

@RestController
public class PostController {

	int counter = 0;
	List<Post> posts = new ArrayList<Post>();
	// post0
	// post1
	// post2

	@GetMapping("/")
	public List<Post> getPosts() {
		return posts;
	}

	@GetMapping("/{id}")
	public Post getPost(@PathVariable("id") Integer id) {
		for (int i = 0; i < posts.size(); i++) {

			if (posts.get(i).getId() == id) {
				return posts.get(i);
			}
		}

		return new Post();
	}

	@PostMapping("/")
	public Post addPost(@RequestBody Post post) {
		post.setId(counter++);
		posts.add(post);
		return post;
	}

	@PutMapping("/{id}")
	public Post updatePost(@RequestBody Post post,
			@PathVariable("id") Integer id) {
		Integer index =-1;
		for (int i = 0; i < posts.size(); i++) {

			if (posts.get(i).getId() == id) {
				index=i;
			}
		}
		
		if (index <0) {
			return new Post();
		}	
		// this refers to posts.get
		// post refers to post
		posts.get(index).copyFromPost(post);
	
		
		return posts.get(index);
	}

}
