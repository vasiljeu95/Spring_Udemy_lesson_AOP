package com.github.vasiljeu95.aop.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Book
 *
 * @author Stepan Vasilyeu
 * @since 01.06.2022
 */
@Component
public class Book {
    @Value("Clear code")
    private String name;
    @Value("Some man")
    private String author;
    @Value("2010")
    private int yearOfPublication;

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
