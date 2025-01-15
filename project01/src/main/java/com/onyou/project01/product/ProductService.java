package com.onyou.project01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;
    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public Product findProduct(int id){
        //return "NoteBook-P";
        return  productRepository.findProduct(id);

    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }
    
}
