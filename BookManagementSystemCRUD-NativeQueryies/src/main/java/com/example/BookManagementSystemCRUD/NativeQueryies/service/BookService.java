package com.example.BookManagementSystemCRUD.NativeQueryies.service;

import com.example.BookManagementSystemCRUD.NativeQueryies.model.Book;
import com.example.BookManagementSystemCRUD.NativeQueryies.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    @Autowired
    BookRepository bookRepository;


    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void addBooks(Book book) {
        bookRepository.save(book);
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);

    }

    public void deleteBookByItsId(int id) {
        bookRepository.deleteById(id);
    }

    public void updateBooks(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getBookByItsTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> getBookByAuthorAndPrice(String author, double price) {
        return bookRepository.findByAuthorAndPrice(author,price);
    }
    public Book expensiveBook(){
        return bookRepository.findMostExpensiveBook();
    }

    public Book cheapestBook() {
        return bookRepository.findCheapestBook();
    }
    public List<Book> booksBetween(double min, double max) {
        return bookRepository.findBooksBetweenPrices(min, max);
    }
}
