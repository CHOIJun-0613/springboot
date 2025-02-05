package com.onyou.project01.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;

public class ProductRepository  {
    
    @Autowired
    EntityManager entityManager;
    
    //DataSource dataSource;
 
    private Map<Integer, Product> db = new HashMap<>();
    private int id = 1;

    // dataSource로 접속 테스트
    public void makeConnection(){
        //DataSourceUtils.getConnection(dataSource);
    }
    public Product findProduct(int idx){
        return db.get(idx);
    }
    public void save(Product product){
        System.out.println(product.getName());
        //db.put(id++, product);
        entityManager.persist(product);
    }
    public List<Product> findProducts() {
        //return new ArrayList<Product>(db.values());
        return entityManager
            .createQuery("SELECT p FROM Product p", Product.class)
            .getResultList();
    }
}
