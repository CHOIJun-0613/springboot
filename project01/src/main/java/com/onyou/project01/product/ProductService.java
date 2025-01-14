package com.onyou.project01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public String findProduct(){
        //return "NoteBook-P";
        return  productRepository.findProduct();

    }
    
}
