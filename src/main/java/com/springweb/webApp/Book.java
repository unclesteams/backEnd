package com.springweb.webApp;

public class Book {
	long id;
	String name;
	String author;
	
	public Book(long id, String name, String author) {
		//super();
		System.out.println("constructor");
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public long getId() {
		System.out.println("get ID");
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getName() {
		System.out.println("get Name");
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getAuthor() {
		System.out.println("get Author");
		return author;
	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	
	
}
