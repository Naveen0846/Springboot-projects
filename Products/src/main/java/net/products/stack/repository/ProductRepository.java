package net.products.stack.repository;

import org.springframework.data.repository.CrudRepository;

import net.products.stack.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
