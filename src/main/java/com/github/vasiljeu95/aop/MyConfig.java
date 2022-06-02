package com.github.vasiljeu95.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * MyConfig
 *
 * @author Stepan Vasilyeu
 * @since 31.05.2022
 */
@Configuration
@ComponentScan("com.github.vasiljeu95.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
