package com.cognixia.lockdown.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognixia.lockdown.blog.models.Post;

@SpringBootApplication
public class Blog1Application {

	public static void main(String[] args) {
		SpringApplication.run(Blog1Application.class, args);
		
		Post p1 = new Post();
		
		Post p2 = new Post();
		
		p1.setTitle("Something");
		p1.setContent("Content");
		
		
		p2.copyFromPost(p1);
		System.out.println(p1);
		System.out.println(p2);
	}

}
