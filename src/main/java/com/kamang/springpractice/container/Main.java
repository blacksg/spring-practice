package com.kamang.springpractice.container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigA.class);
        context.refresh();
        
        BeanB beabB = context.getBean("beanB", BeanB.class);
        beabB.doSomething();
        
        context.close();
    }
}
