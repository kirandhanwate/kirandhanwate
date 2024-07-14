package com.tech.servicei;

import java.util.List;

import com.tech.entity.BookDetails;
import com.tech.entity.Library;


public interface Servicei {

	String saveData(BookDetails book);
	
	void removeBookDetails(String code);
	BookDetails getBook(String book);
	List<BookDetails> getAllBooks();
	List<BookDetails> getLibraryBook();
	
	String addData(Library l);
	
}
