package com.infosistem.infosistem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.infosistem.infosistem.model.InfoSistemBookData;
import com.infosistem.infosistem.service.BookService;

/**
 * @author SuzanaHersak
 *
 */

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/api/book")
	public List<InfoSistemBookData> getBook() {
		List<InfoSistemBookData> book = bookService.retrieveBook();
		return book;
	}

	@GetMapping("/api/book/{bookId}")
	public InfoSistemBookData getBook(@PathVariable(name = "bookId") Long bookId) {
		return bookService.getBook(bookId);
	}

	@PostMapping("/api/book")
	public void saveBook(InfoSistemBookData book) {
		bookService.saveBook(book);
		System.out.println("New book is saved Successfully!");
	}

	@DeleteMapping("/api/book/{bookId}")
	public void deleteBook(@PathVariable(name = "bookId") Long bookId) {
		bookService.deleteBook(bookId);
		System.out.println("Book is deleted Successfully!");
	}

	@PutMapping("/api/book/{bookId}")
	public void updateBook(@RequestBody InfoSistemBookData book, @PathVariable(name = "bookId") Long bookId) {
		InfoSistemBookData emp = bookService.getBook(bookId);
		if (emp != null) {
			bookService.updateBook(book);
		}
	}
}
