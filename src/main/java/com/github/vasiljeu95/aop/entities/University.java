package com.github.vasiljeu95.aop.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * University
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student studentFirst = new Student("Stepan Vasilyeu", 4, 7.5);
        Student studentSecond = new Student("Alex Korotkov", 5, 10);
        Student studentThird = new Student("Vlad Nordland", 2, 9.5);

        students.add(studentFirst);
        students.add(studentSecond);
        students.add(studentThird);
    }

    public List<Student> getStudents(){
        System.out.println("Getting started with the method getStudents");
        System.out.println(students.get(4));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
