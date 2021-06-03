package com.cognixia.lockdown.blog.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

// DTO Data Transfer Object
@JsonInclude(Include.NON_NULL)
public class Response {
	public String message;
	public List<Post> posts;	
	public Post post;	
}
