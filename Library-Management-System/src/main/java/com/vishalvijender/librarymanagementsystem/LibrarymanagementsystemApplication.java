package com.vishalvijender.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.vishalvijender.librarymanagementsystem.entity.Author;
import com.vishalvijender.librarymanagementsystem.entity.Book;
import com.vishalvijender.librarymanagementsystem.entity.Category;
import com.vishalvijender.librarymanagementsystem.entity.Publisher;
import com.vishalvijender.librarymanagementsystem.service.BookService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LibrarymanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}

}
