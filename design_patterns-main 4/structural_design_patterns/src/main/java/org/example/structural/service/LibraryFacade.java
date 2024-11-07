package org.example.structural.service;


import org.example.structural.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryFacade {


    @Autowired
    private BookService bookService;

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public List<Book> getFeaturedBooks() {
        return bookService.getAllBooks()
                .stream()
                .filter(Book::isFeatured)
                .collect(Collectors.toList());
    }

    public Book getBookbyTitle(String title){
        return bookService.getBookByTitle(title);

    }
    public Book getBookbyAuthor(String author) {
        return bookService.getBookByAuthor(author);
    }

}