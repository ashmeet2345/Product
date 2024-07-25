package com.example.ProductWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("products")
    public List<Product> getProducts(){
        return service.getAllProducts();
    }

    @GetMapping("products/{name}")
    public Product getProduct(@PathVariable("name") String name){
        return service.getProductByName(name);
    }

    @PostMapping("products")
    public void addProduct(@RequestBody Product p){
        service.saveProduct(p);
    }
}
