package com.github.vasiljeu95.aop.tests;

import com.github.vasiljeu95.aop.MyConfig;
import com.github.vasiljeu95.aop.entities.Student;
import com.github.vasiljeu95.aop.entities.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Test2
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
public class TestingAfterReturning {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = applicationContext.getBean("university", University.class);
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);

        applicationContext.close();
    }
}
