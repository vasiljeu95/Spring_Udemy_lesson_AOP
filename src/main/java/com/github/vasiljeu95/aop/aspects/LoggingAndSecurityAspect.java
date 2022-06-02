package com.github.vasiljeu95.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * LoggingAspect
 *
 * @author Stepan Vasilyeu
 * @since 31.05.2022
 */
@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* com.github.vasiljeu95.aop.libraries.UniversityLibrary.* (..))")
//    private void allMethodsFromUniversityLibrary() {}
//
//    @Pointcut("execution(public void com.github.vasiljeu95.aop.libraries.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniversityLibrary(){}
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !(returnMagazineFromUniversityLibrary())")
//    private void allMethodsExceptReturnMagazineFromUniversityLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }

//    @Pointcut("execution(* com.github.vasiljeu95.aop.libraries.UniversityLibrary.get* ())")
//    private void allGetMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(* com.github.vasiljeu95.aop.libraries.UniversityLibrary.return* ())")
//    private void allReturnMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()")
//    private void allGetAndReturnMethodsFromUniversityLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

//    @Pointcut("execution(* get*())")
//    public void allGetMethods() {}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Logging you try get book/magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: security check when you try get book/magazine");
//    }
}
