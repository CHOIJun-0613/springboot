package com.onyou.project01.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    
    private Map<Integer, String> db = new HashMap<>();
    private int id = 1;
    public String findProduct(){
        return "NoteBook-M";
    }
}
