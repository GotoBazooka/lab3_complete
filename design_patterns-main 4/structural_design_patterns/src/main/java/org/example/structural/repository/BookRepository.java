package org.example.structural.repository;


import org.example.structural.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional query methods can be defined here if needed

    Book findbyId(Long id);
    Book save(Book book);
    void deleteById(Long id);
    List<Book> findByFeatured();
    List<Book> findAll();
    Book getByAuthor(String author);
    Book getByTitle(String title);

}
