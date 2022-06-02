package com.github.vasiljeu95.aop.aspects;

import com.github.vasiljeu95.aop.entities.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * LoggingAspect
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("com.github.vasiljeu95.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature() = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Information about book: " +
                            "name - " + myBook.getName() +
                            ", author - " + myBook.getAuthor() +
                            ", years of publication - " + myBook.getYearOfPublication());
                }
                if (obj instanceof String){
                    System.out.println("The book was add to library from: " + obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: Logging you try get book/magazine");
        System.out.println(">>>>>----------------------------------------------->>>>>");
    }
}
