package com.ecommercestructure.products.services;

import com.ecommercestructure.products.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    List<Product> findAllProducts();

    Product findById(Long id);

    void createProduct(Product product);

    void bulkCreate(List<Product> products);

    void deleteProduct(Long id);
}
