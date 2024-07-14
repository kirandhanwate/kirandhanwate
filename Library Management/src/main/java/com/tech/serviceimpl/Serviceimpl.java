package com.tech.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.BookDetails;
import com.tech.entity.Library;
import com.tech.repo.MyRepo;
import com.tech.servicei.Servicei;

@Service
public class Serviceimpl implements Servicei{
	
	@Autowired
	MyRepo re;
	
	@Override
	public String saveData(BookDetails book) {
		
re.save(book);
		return "Book details added successfully";
	}

	@Override
	public void removeBookDetails(String code) {
		re.deleteById(code);
		
	}

	@Override
	public BookDetails getBook(String book) {
		Optional<BookDetails> byId = re.findById(book);
		BookDetails bookDetails = byId.get();
		return bookDetails;
	}

	@Override
	public List<BookDetails> getAllBooks() {
		
		return re.findAll();
	}

	@Override
	public List<BookDetails> getLibraryBook() {
		
		return re.findAll();
	}

	@Override
	public String addData(Library l) {
re.save(l);
		return null;
	}
	
	

}
