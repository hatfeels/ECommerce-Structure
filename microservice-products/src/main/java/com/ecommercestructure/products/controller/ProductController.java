package com.ecommercestructure.products.controller;

import com.ecommercestructure.products.entities.Product;
import com.ecommercestructure.products.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @PostMapping("/create/bulk")
    @ResponseStatus(HttpStatus.CREATED)
    public void bulkProducts(@RequestBody List<Product> products) {
        productService.bulkCreate(products);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts (){
        return productService.findAllProducts();
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok(productService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void deleteProduct (@PathVariable Long id){
        productService.deleteProduct(id);
    }

}
