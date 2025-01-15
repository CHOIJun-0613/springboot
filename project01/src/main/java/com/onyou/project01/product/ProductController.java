package com.onyou.project01.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
public class ProductController {
    // 사용자(화면) 요청을 던지면
    // 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬거예요
    // autowired
    @Autowired
    private ProductService productService;

    //전체 상품 조회
    @GetMapping("/products")
    public List<Product> findProducts() {
        return productService.findProducts();
    }
    

    // 개별 상품 조회
    //@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable("id") int id){
        System.out.println("id = " + id);
        return productService.findProduct(id);
    }
    //상품등록
    //@RequestMapping(value = "/products", method=RequestMethod.POST)
    @PostMapping("/products")
    public void saveProduct(@RequestBody Product product) {
        System.out.println("POST");
        productService.saveProduct(product);
    }
    



}
