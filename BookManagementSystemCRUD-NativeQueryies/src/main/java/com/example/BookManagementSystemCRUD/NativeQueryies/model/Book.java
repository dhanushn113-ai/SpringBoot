package com.example.BookManagementSystemCRUD.NativeQueryies.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    private int id;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private boolean available;

}
