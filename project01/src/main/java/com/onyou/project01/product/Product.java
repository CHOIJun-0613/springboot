package com.onyou.project01.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    // EntityContext 안에서 identifier(식별자 = DB의 PK)를 가지고 Entity를 구별
    @Id
    private int id;
    private String name;
    private int price;
    private String description;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
    }
    
}
