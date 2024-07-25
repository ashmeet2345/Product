package org.example.spring;


import java.util.List;

public class ProductService {

    ProductDB db=new ProductDB();

    public ProductService() {
    }

    public void addProduct(Product product){
        db.addProduct(product);
    }

    public List<Product> getAllProducts(){
        return db.getAllProducts();
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
