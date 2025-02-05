package com.onyou.project01.product;

import java.util.List;

public interface ProductRepositoryInterface {
    public Product findProduct(int idx);
    public void save(Product product);
    public List<Product> findProducts() ;

}
