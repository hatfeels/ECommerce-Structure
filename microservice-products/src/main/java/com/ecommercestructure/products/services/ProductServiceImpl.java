package com.ecommercestructure.products.services;

import com.ecommercestructure.products.entities.Product;
import com.ecommercestructure.products.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void bulkCreate(List<Product> products) {
        productRepository.saveAll(products);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
