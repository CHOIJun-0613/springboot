package com.onyou.project01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class ProductController {
    // 사용자(화면) 요청을 던지면
    // 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬거예요
    // autowired
    @Autowired
    private ProductService productService;
    // 상품 조회
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String findProduct(){

        return productService.findProduct();
    }



}
