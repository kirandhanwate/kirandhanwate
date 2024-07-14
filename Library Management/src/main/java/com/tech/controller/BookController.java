package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.BookDetails;

import com.tech.servicei.Servicei;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/book")
public class BookController {
    
	@Autowired
	Servicei si;
	
	@PostMapping("/information")
	ResponseEntity<String> addBook(@RequestBody BookDetails book,BindingResult result){
		
		String resp;
		HttpStatus httpStatus;
		
		if(result.hasErrors()) {
			resp="Invalide Book Details"+result.getAllErrors();
			httpStatus=HttpStatus.BAD_REQUEST;
			
			return new ResponseEntity<String>(resp,httpStatus);
		}
		
		resp=si.saveData(book);
		httpStatus=HttpStatus.CREATED;
		
		return new ResponseEntity<String>(resp,httpStatus);
		
	}
	@DeleteMapping("/remove/{code}")
	ResponseEntity<String> removeData(@PathVariable String code){
		si.removeBookDetails(code);
	
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	@GetMapping("/get/{book}")
	ResponseEntity<Object> getBook( @PathVariable String book){
		
		String resp;
		HttpStatus httpStatus;
		BookDetails b= si.getBook(book);
		
		if(b==null) {
			httpStatus=HttpStatus.NOT_FOUND;
			resp=book+"Not Found";
			return new ResponseEntity<Object>(resp,httpStatus);
			
		}
		httpStatus=HttpStatus.FOUND;
		return new ResponseEntity<Object>(b,httpStatus);
	}
	@GetMapping("/get/allbooksdetails")
	ResponseEntity<List<BookDetails>> getAll(){
		
		List<BookDetails> e = si.getAllBooks();
		return new ResponseEntity<List<BookDetails>>(e, HttpStatus.OK);
	}

}
