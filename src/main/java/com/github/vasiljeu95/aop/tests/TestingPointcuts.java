package com.github.vasiljeu95.aop.tests;

import com.github.vasiljeu95.aop.MyConfig;
import com.github.vasiljeu95.aop.entities.Book;
import com.github.vasiljeu95.aop.libraries.SchoolLibrary;
import com.github.vasiljeu95.aop.libraries.UniversityLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Test1
 *
 * @author Stepan Vasilyeu
 * @since 31.05.2022
 */
public class TestingPointcuts {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = applicationContext.getBean("universityLibrary", UniversityLibrary.class);
        SchoolLibrary schoolLibrary = applicationContext.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = applicationContext.getBean("book", Book.class);

        universityLibrary.getBook();
//        universityLibrary.returnBook();
//        universityLibrary.getMagazine();
//        universityLibrary.returnMagazine();
//        universityLibrary.addBook();
//        universityLibrary.addMagazine();
//        schoolLibrary.getBook();
        universityLibrary.addBook("Stepan", book);
        universityLibrary.addMagazine();

        applicationContext.close();
    }
}
