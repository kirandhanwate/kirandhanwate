package com.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.tech.entity.BookDetails;
import com.tech.entity.Library;

@Repository
public interface MyRepo extends JpaRepository<BookDetails, String>{

	void save(Library l);

}
