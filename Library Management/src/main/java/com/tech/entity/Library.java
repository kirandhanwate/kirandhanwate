package com.tech.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

import lombok.Data;
@Entity
@Data
public class Library {
	@Id
	private int department_No;
     
    private String department;
    @OneToMany
	private List<BookDetails> bookDetails;
	
	
}
