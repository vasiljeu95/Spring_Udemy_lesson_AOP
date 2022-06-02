package com.github.vasiljeu95.aop.tests;

import com.github.vasiljeu95.aop.MyConfig;
import com.github.vasiljeu95.aop.entities.Student;
import com.github.vasiljeu95.aop.entities.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * TestingAfterThrowing
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
public class TestingAfterThrowing {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = applicationContext.getBean("university", University.class);
        university.addStudents();

        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e){
            System.out.println("!!! An exception was caught: " + e);
        }

        applicationContext.close();
    }
}
