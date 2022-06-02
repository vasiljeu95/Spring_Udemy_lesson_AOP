package com.github.vasiljeu95.aop.libraries;

import com.github.vasiljeu95.aop.entities.Book;
import org.springframework.stereotype.Component;

/**
 * library
 *
 * @author Stepan Vasilyeu
 * @since 31.05.2022
 */
@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("We get the book from UniversityLibrary");
        System.out.println("--------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return book in UniversityLibrary");
        System.out.println("-----------------------------------");
    }

    public void getMagazine(){
        System.out.println("We get the Magazine from UniversityLibrary");
        System.out.println("------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine in UniversityLibrary");
        System.out.println("---------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add book in UniversityLibrary");
        System.out.println("--------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine in UniversityLibrary");
        System.out.println("------------------------------------");
    }
}
