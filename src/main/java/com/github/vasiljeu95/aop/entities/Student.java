package com.github.vasiljeu95.aop.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Student
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@ToString
public class Student {
    @Getter @Setter
    private String nameSurname;
    @Getter @Setter
    private int course;
    @Getter @Setter
    private double avgGrade;

    public Student(String nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
