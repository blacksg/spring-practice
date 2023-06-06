package com.kamang.springpractice.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigB.class)
public class ConfigA {
    
    @Bean
    BeanA beanA() {
        return new BeanA();
    }
}
