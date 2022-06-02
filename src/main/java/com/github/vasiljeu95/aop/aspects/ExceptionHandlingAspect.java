package com.github.vasiljeu95.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ExceptionHandlingAspect
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.github.vasiljeu95.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: Catch and handle exception when you try get book/magazine");
        System.out.println(">>>>>--------------------------------------------------------------------------------->>>>>");
    }
}
