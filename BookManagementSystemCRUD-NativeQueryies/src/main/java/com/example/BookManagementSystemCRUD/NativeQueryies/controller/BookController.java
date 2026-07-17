package com.example.BookManagementSystemCRUD.NativeQueryies.controller;

import com.example.BookManagementSystemCRUD.NativeQueryies.model.Book;
import com.example.BookManagementSystemCRUD.NativeQueryies.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("book")
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }
    @PostMapping("book")
    public String addBooks(@RequestBody Book book){
        bookService.addBooks(book);
        return "added";
    }
    @GetMapping("book/{id}")
    public Book getBookById(@PathVariable("id") int id){
       return bookService.getBookById(id);
    }
    @PutMapping("book")
    public String updateBooks(@RequestBody Book book){
        bookService.updateBooks(book);
        return "updated";
    }
    @DeleteMapping("book/{id}")
    public String deleteBookByItsId(@PathVariable("id") int id){
        bookService.deleteBookByItsId(id);
        return "deleted";
    }

    @GetMapping("book/title/{title}")
    public List<Book> getBookByItsTitle(@PathVariable("title") String title){
       return bookService.getBookByItsTitle(title);
    }
    @PostMapping("book/filter")
    public List<Book> getBookByAuthorAndPrice(@Param("author") String author, @Param("price") double price){
        return bookService.getBookByAuthorAndPrice(author,price);
    }
    @GetMapping("/expensive")
    public Book expensiceBook(){
        return bookService.expensiveBook();
    }
    @GetMapping("/cheap")
    public Book cheapestBook(){
        return bookService.cheapestBook();
    }
    @GetMapping("/between")
    public List<Book> getBooksBetween(
            @RequestParam double min,
            @RequestParam double max) {

        return bookService.booksBetween(min, max);
    }


}
