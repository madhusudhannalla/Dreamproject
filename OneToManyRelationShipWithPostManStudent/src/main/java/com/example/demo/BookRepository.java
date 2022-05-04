package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	public Book findByBookId(int bookId);

	
	@Query("SELECT new com.example.demo.StroyJoin(b.bookName,s.storyName,b.bookId,s.storyId) FROM Book b JOIN b.storyList s")
	public List<StroyJoin> getDetails();
}