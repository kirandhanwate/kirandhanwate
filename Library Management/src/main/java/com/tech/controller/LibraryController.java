package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.BookDetails;
import com.tech.entity.Library;
import com.tech.servicei.Servicei;

@RestController("/library")
public class LibraryController {
	@Autowired
	Servicei si;
	
	@PostMapping("/all/information")
	ResponseEntity<String> addDetails(@RequestBody Library l,BindingResult result){
		
		String resp;
		HttpStatus httpStatus;
		
		if(result.hasErrors()) {
			resp="Invalide Book Details"+result.getAllErrors();
			httpStatus=HttpStatus.BAD_REQUEST;
			
			return new ResponseEntity<String>(resp,httpStatus);
		}
		
		resp=si.addData(l);
		httpStatus=HttpStatus.CREATED;
		
		return new ResponseEntity<String>(resp,httpStatus);
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
	@GetMapping("/get/allLibrarydetails")
	ResponseEntity<List<BookDetails>> getAll(){
		
		List<BookDetails> e = si.getLibraryBook();
		return new ResponseEntity<List<BookDetails>>(e, HttpStatus.OK);
	}

	

}
