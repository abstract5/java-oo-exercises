package Blogz;

import java.util.Date;

public class Post extends Entity{
	private final Date created = new Date();
	private Date modified;
	private String body, title, author;
	
	public Post(String title, String body, String author){
		super();
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public Date getModified() {
		return modified;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
		this.modified = new Date();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.modified = new Date();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
