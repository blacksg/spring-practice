package com.kamang.springpractice.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    BeanExample beanExample() {
        return new BeanExample();
    }
}
