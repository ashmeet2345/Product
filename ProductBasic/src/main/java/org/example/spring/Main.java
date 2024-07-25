package org.example.spring;

public class Main {
    public static void main(String[] args) {
        ProductService service=new ProductService();
        System.out.println(service.getAllProducts());
    }
}