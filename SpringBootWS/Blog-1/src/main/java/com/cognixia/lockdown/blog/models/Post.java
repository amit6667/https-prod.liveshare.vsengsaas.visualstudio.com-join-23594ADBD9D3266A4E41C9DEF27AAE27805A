package com.cognixia.lockdown.blog.models;

public class Post {


	private Integer id;
	private String title;
	private String content;

	public void copyFromPost(Post post) {
		if (post.getContent()!=null) {
			this.setContent(post.getContent());
		}
		
		if (post.getTitle()!=null) {
			this.setTitle(post.getTitle());
		}
		
	}
	
	// -------------------------Getters and Setters-------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// ------------------------------------Constructors------------------------------------------

	public Post(Integer id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public Post() {
		super();
	}

	// ----------------------------------ToString------------------------------------------

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
}
