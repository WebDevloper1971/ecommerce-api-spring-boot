package com.ecomm.api.controllers;

import com.ecomm.api.entities.Product;
import com.ecomm.api.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;


    @GetMapping("/products")
    public List<Product> allProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable @NonNull Long id){
        return Optional.ofNullable(productService.getProductById(id));
    }


    @PostMapping("/product")
    public String saveProduct(@RequestBody Product product){
        return productService.save(product);
    }


}
