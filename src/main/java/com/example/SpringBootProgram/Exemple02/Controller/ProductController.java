package com.example.SpringBootProgram.Exemple02.Controller;

import java.util.List;

import com.example.SpringBootProgram.Exemple02.Model.Product;
import com.example.SpringBootProgram.Exemple02.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/product")

    public List<Product> getProduct(){
        List<Product> products = productService.findAll();
        return products;

        }
        @PostMapping("/A")
        public Product Send(@RequestBody Product product){
        productService.addall(product);
        return product;

        }

}
