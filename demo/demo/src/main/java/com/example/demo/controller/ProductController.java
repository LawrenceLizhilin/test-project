package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
public class ProductController {
    private ArrayList<Product> productList = new ArrayList<>();

    public ProductController(){
        productList.add(new Product("i 11",200,"intel",20,3)); //call Employee(final String,final String)
    }

    @GetMapping("/product")
        public ArrayList<Product> get(){
            return productList;
        }

    @GetMapping("/product/{id}")
        public Product retrieveOneProduct(@PathVariable("id") int id){
            return productList.get(id);
        }

    @PostMapping(value = "/product")
        public void addOneProduct(@RequestBody Product product){
            productList.add(product);
        }
    
    @PutMapping("/product/{id}")
        public void editOneProduct(@PathVariable("id") int id, @RequestBody Product product){
            productList.add(id,product);
        }
    
    @DeleteMapping("product/{id}")
        public void removeOneProduct(@PathVariable("id") int id){
            productList.remove(id);
        }
}

