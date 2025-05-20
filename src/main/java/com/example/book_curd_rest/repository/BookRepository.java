package com.example.book_curd_rest.repository;

import com.example.book_curd_rest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}


