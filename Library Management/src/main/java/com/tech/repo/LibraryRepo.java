package com.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.entity.Library;

public interface LibraryRepo extends JpaRepository<Library, Integer> {

}
