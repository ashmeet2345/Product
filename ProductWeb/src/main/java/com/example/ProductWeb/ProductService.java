package com.example.ProductWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductDB db;

    public ProductService(){
    }

    public void addProduct(Product product){
        db.save(product);
    }

    public List<Product> getAllProducts(){
        return db.findAll();
    }

    public Product getProductByName(String name){
        return db.findByName(name);
    }

    public void saveProduct(Product p){
        db.save(p);
    }
    /*public Product getProductByName(String name){
        return db.f
    }*/

    /*public List<Product> getProductByText(String text){
        return products.stream().filter(p-> p.getName().toLowerCase().equals(text.toLowerCase())
                || p.getType().toLowerCase().equals(text.toLowerCase())
                || p.getPlace().toLowerCase().equals(text.toLowerCase())).collect(Collectors.toUnmodifiableList());
    }*/


}
