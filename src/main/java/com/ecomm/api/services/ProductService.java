package com.ecomm.api.services;

import com.ecomm.api.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {


    String save(Product product);

    String delete(Long id);

    Product update(Product product);

    Product getProductById(Long id);

    List<Product> getAllProducts();

}
