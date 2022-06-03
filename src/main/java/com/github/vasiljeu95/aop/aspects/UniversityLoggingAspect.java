package com.github.vasiljeu95.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * UniversityLoggingAspect
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents ())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: Logging getting a list of students before getStudents method");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents ())", returning = "studentList")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> studentList){
//        Student firstStudent = studentList.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging getting a list of students after returning getStudents method");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents ())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: Logging Throwing " + exception);
//    }

    @After("execution(* getStudents ())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: Logging normal finish the program or caught exception");
    }

}
