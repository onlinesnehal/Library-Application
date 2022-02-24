package com.learning.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Book {

    private String book_name;
    private int book_price;
    @Id
    private long book_id;
    private String book_author;
    private String book_category;
}
