package com.cognixia.lockdown.blog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.lockdown.blog.models.Post;
import com.cognixia.lockdown.blog.models.Response;

@RestController
public class PostController {

	int counter = 0;
	List<Post> posts = new ArrayList<Post>();
	// post0
	// post1
	// post2

	@GetMapping("/")
	public ResponseEntity<Response> getPosts() {
		HttpStatus status;
		Response resp = new Response();
		
		if (posts.size() == 0) {
			resp.message = "No records added";
			status = HttpStatus.OK;
		} else if (posts.size() == 1) {
			resp.message = "Single record retrieved";
			status = HttpStatus.OK;
		} else {
			resp.message = posts.size() + " record(s) retrieved";
			status = HttpStatus.OK;
		}
		
		resp.posts = posts;
		ResponseEntity<Response> respEntity = new ResponseEntity<Response>(resp, status);

		return respEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getPost(@PathVariable("id") Integer id) {
		Response resp = new Response();
		resp.message = "Record with id " + id + " not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		for (int i = 0; i < posts.size(); i++) {

			if (posts.get(i).getId() == id) {
				resp.post = posts.get(i);
				resp.message="Post with id " + id + " found and retrieved";
				status = HttpStatus.OK;
			}
		}

		ResponseEntity<Response> respEntity = new ResponseEntity<Response>(resp,status);
		return respEntity;
	}

	@PostMapping("/")
	public Post addPost(@RequestBody Post post) {
		post.setId(counter++);
		posts.add(post);
		return post;
	}

	@PutMapping("/{id}")
	public Post updatePost(@RequestBody Post post, @PathVariable("id") Integer id) {
		Integer index = -1;
		for (int i = 0; i < posts.size(); i++) {

			if (posts.get(i).getId() == id) {
				index = i;
			}
		}

		if (index < 0) {
			return new Post();
		}
		// this refers to posts.get
		// post refers to post
		posts.get(index).copyFromPost(post);

		return posts.get(index);
	}

	@DeleteMapping("/{id}")
	public Post deletePost(@PathVariable("id") Integer id) {
		int index = -1;
		for (int i = 0; i < posts.size(); i++) {

			if (posts.get(i).getId() == id) {
				index = i;
			}
		}
		if (index < 0) {
			return new Post();
		}

		Post post = posts.get(index);
		posts.remove(index);

		return post;
	}
}
