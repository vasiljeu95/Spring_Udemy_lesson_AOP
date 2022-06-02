package com.github.vasiljeu95.aop.libraries;

import org.springframework.stereotype.Component;

/**
 * SchoolLibrary
 *
 * @author Stepan Vasilyeu
 * @since 31.05.2022
 */
@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from SchoolLibrary");
    }
}
