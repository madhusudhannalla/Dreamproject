package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@Autowired
	private StoryRepository srepo;

	@RequestMapping(value = "/savebook", method = RequestMethod.POST)
	@ResponseBody
	public Book saveBook(@RequestBody Book book) {
		Book bookResponse = repo.save(book);
		return bookResponse;
	}

	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	@ResponseBody
	public Book getBookDetails(@PathVariable int bookId) {
		Book bookResponse = repo.findByBookId(bookId);

		return bookResponse;
	}
	
	@GetMapping("/get")
	public List<StroyJoin> getRecordsBasedOnBookId() {
		List<StroyJoin> details = repo.getDetails();
		return details;
	}

}