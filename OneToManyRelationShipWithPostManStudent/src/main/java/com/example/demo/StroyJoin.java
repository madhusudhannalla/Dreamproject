package com.example.demo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StroyJoin implements Serializable {

private String bookName;

private String storyName;

private int bookId;

private int storyId;




public StroyJoin() {
	// TODO Auto-generated constructor stub
}


public StroyJoin(String bookName, String storyName, int bookId, int storyId) {
	super();
	this.bookName = bookName;
	this.storyName = storyName;
	this.bookId = bookId;
	this.storyId = storyId;
}






public int getBookId() {
	return bookId;
}






public void setBookId(int bookId) {
	this.bookId = bookId;
}






public int getStoryId() {
	return storyId;
}






public void setStoryId(int storyId) {
	this.storyId = storyId;
}






public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getStoryName() {
	return storyName;
}

public void setStoryName(String storyName) {
	this.storyName = storyName;
}






@Override
public String toString() {
	return "StroyJoin [bookName=" + bookName + ", storyName=" + storyName + ", bookId=" + bookId + ", storyId="
			+ storyId + "]";
}


	
}
