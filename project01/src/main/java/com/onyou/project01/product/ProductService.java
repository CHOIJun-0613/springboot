package com.onyou.project01.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
    @Autowired
    private SpringDataJPAProductRepository springDataJPAProductRepository;
    
    public Product findProduct(int id){
        return springDataJPAProductRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

    }
    @Transactional
    public void saveProduct(Product product){
        springDataJPAProductRepository.save(product);
    }
    public List<Product> findProducts() {
        return springDataJPAProductRepository.findAll();
    }
}
