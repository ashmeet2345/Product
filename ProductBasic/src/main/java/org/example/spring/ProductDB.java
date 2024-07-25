package org.example.spring;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ProductDB  {
    private static final String url="jdbc:mysql://localhost:3306/JdbcTest";
    private static final String user="root";
    private static final String password="root";
    private static final Connection con;

    static {
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ProductDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void addProduct(Product product) {
        String query="INSERT INTO PRODUCT(NAME,TYPE,PLACE,WARRANTY) VALUES(?,?,?,?)";

        try(PreparedStatement ps= con.prepareStatement(query)){
            ps.setString(1, product.getName());
            ps.setString(2, product.getType());
            ps.setString(3, product.getPlace());
            ps.setDate(4, Date.valueOf(product.getWarranty()));

            int rs=ps.executeUpdate();
            if(rs>0){
                System.out.println("Product added successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAllProducts(){
        String query="SELECT NAME,TYPE,PLACE,WARRANTY FROM PRODUCT";
        List<Product> products=new ArrayList<>();
        try(PreparedStatement ps= con.prepareStatement(query)){
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Product p=new Product();
                p.setName(rs.getString("NAME"));
                p.setPlace(rs.getString("PLACE"));
                p.setType(rs.getString("TYPE"));
                p.setWarranty(rs.getDate("WARRANTY").toLocalDate());

                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
