package com.onyou.project03.api;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.onyou.project03.dto.CoffeeDto;
import com.onyou.project03.entity.Coffee;
import com.onyou.project03.repository.CoffeeRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Slf4j
@RestController
public class CoffeeApiController {
    @Autowired
    private CoffeeRepository coffeeRepository;

    // GET
    @GetMapping("/api/coffees")
    public Iterable<Coffee> index() {
        return coffeeRepository.findAll();
    }
    @GetMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> show(@PathVariable Long id) {
        Coffee coffee = coffeeRepository.findById(id).orElse(null);
        return (coffee != null) ?
            ResponseEntity.status(HttpStatus.OK).body(coffee) :
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    
    // POST
    @PostMapping("/api/coffees")
    public ResponseEntity<Coffee> create(@RequestBody CoffeeDto dto) {
        Coffee coffee = dto.toEntity();
        log.info("create coffee:{}", coffee.toString());
        if(coffee.getId() != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Coffee created = coffeeRepository.save(coffee);
        log.info("created coffee:{}", created.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // PATCH
    @PatchMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> update(@PathVariable Long id, @RequestBody CoffeeDto coffeeDto){
        Coffee coffee = coffeeDto.toEntity();
        log.info("id:{}, coffee:{}", id, coffee.toString());
        Coffee target = coffeeRepository.findById(id).orElse(null);
        if(target == null || id != coffee.getId()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        target.patch(coffee);
        Coffee updated = coffeeRepository.save(target);
        return ResponseEntity.status(HttpStatus.OK).body(updated);

    }

    // DELETE 
    @DeleteMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> delete(@PathVariable Long id){
        Coffee target = coffeeRepository.findById(id).orElse(null);
        if(target == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        coffeeRepository.delete(target);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    

}
