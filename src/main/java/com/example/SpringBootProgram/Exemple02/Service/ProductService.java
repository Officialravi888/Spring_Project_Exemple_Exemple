package com.example.SpringBootProgram.Exemple02.Service;

import com.example.SpringBootProgram.Exemple02.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    public List<Product> findAll() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(13, "Mobile", "Cl89", 8990, 98));
        return products;

    }
    public Product addall(Product product){
        List<Product>list=new ArrayList<>();
        list.add(product);
        return product;
    }
}
