package com.example.BookManagementSystemCRUD.NativeQueryies.repository;


import com.example.BookManagementSystemCRUD.NativeQueryies.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByTitle(String title);

    @Query(nativeQuery = true, value = "select * from book where author= :author and price = :price")
    List<Book> findByAuthorAndPrice(@Param("author") String author, @Param("price") double price);

    //findMost ExpensiveBook
    @Query(nativeQuery = true, value = "select * from book order by price desc limit 1")
    Book findMostExpensiveBook();

    //find the cheapestBook
    @Query(nativeQuery = true, value = "select * from book order by price asc limit 1")
    Book findCheapestBook();

    //find books between min and pax
    @Query(value = "SELECT * FROM book WHERE price BETWEEN :min AND :max", nativeQuery = true)
    List<Book> findBooksBetweenPrices(@Param("min") double min,
                                      @Param("max") double max);
}
