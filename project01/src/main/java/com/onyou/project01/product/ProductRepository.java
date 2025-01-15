package com.onyou.project01.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



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
    public List<Product> findProducts() {
        return new ArrayList<Product>(db.values());
    }
}
