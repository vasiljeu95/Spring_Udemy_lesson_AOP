package com.github.vasiljeu95.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * SecurityAspect
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.github.vasiljeu95.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Security check when you try get book/magazine");
        System.out.println(">>>>>------------------------------------------------------------>>>>>");
    }
}
