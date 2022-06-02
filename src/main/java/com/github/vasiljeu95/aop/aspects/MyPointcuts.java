package com.github.vasiljeu95.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 * MyPointcuts
 *
 * @author Stepan Vasilyeu
 * @since 02.06.2022
 */
public class MyPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}

//    @Pointcut("execution(* get*())")
//    public void allGetMethods() {}
}
