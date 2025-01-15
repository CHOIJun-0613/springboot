package com.onyou.project01.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    
    private Map<Integer, Product> db = new HashMap<>();
    private int id = 1;
    public Product findProduct(int idx){
        return db.get(idx);
    }
    public void save(Product product){
        System.out.println(product.getName());
        db.put(id++, product);
    }
}
