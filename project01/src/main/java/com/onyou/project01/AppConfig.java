package com.onyou.project01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onyou.project01.product.ProductRepository;

@Configuration
public class AppConfig {
    @Bean
    public ProductRepository productRepository(){
        return new ProductRepository();
    }

}
