package com.ecomm.api.services;

import com.ecomm.api.entities.Product;
import com.ecomm.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{

    @Autowired
    ProductRepository productRepository;


    @Override
    public String save(Product product) {
        productRepository.save(product);
        return "Product saved successfully";
    }

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Product deleted successfully";
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
