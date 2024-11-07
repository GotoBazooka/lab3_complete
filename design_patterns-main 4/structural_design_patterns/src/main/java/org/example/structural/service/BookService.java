package org.example.structural.service;


import org.example.structural.entity.Book;
import org.example.structural.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book getBookById(Long id) {
        return bookRepository.findbyId(id);
    }

    public Book updateBook(Book book) {
        Book existingBook = bookRepository.findbyId(book.getId());
        if (existingBook != null) {
            return bookRepository.save(book);
        } else {
            throw new
                    RuntimeException("Book with ID " + book.getId() + "  is not found!");
        }
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getFeaturedBooks() {
        return bookRepository.findByFeatured();}

    public Book getBookByTitle(String title) {
        return bookRepository.getByTitle(title);
    }
    public Book getBookByAuthor(String author) {
        return bookRepository.getByAuthor(author);
    }
}