package com.github.vasiljeu95.aop.aspects;

import com.github.vasiljeu95.aop.entities.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * UniversityLoggingAspect
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents ())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: Logging getting a list of students before getStudents method");
    }

    @AfterReturning(pointcut = "execution(* getStudents ())", returning = "studentList")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> studentList){
        Student firstStudent = studentList.get(0);
        
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging getting a list of students after returning getStudents method");
    }
}
