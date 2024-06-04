package com.BookData.springboothibernateBooksData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@Autowired
	BooksRepository brepo;
	@RequestMapping("/test")
	public String test()
	{
		return "This is demo test form books";
	}
	
	@RequestMapping("/bookdata")
	public String bookdata(@RequestBody Books b)
	{
		brepo.save(b);
		return "Books data is saved to database";
	}
}
