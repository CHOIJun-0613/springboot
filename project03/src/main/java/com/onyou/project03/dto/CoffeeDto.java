package com.onyou.project03.dto;

import com.onyou.project03.entity.Coffee;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class CoffeeDto {
    private Long id;
    private String name;
    private int price;
    public Coffee toEntity() {
        return new Coffee(id, name, price);
    }

}
