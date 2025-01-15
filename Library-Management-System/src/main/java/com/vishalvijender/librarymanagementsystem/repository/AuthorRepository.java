package com.vishalvijender.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishalvijender.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
