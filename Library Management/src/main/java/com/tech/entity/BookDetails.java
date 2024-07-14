package com.tech.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class BookDetails {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String e_Code;
	private String book_Name;
	private String author;
	private int no_Of_Pages;
	private int no_Of_Books;
	@OneToOne
	private Library library;
	
	
	
}
