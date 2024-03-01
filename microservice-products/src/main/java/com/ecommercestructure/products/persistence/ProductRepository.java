package com.ecommercestructure.products.persistence;

import com.ecommercestructure.products.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> { // request personalisadas entre MS

}
