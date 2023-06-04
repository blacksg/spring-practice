package com.kamang.springpractice.container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        
        BeanExample beanExample = context.getBean(BeanExample.class);
        beanExample.doSomething();
        
        context.close();
    }
}
