package net.products.stack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.products.stack.entity.Product;
import net.products.stack.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	//GET PRODUCTS
	@GetMapping(value ="/products")
	private List<Product> getAllProduct(){
		return service.getAllProduct();		
	}


	//GET PRODUCTS BY ID
	@GetMapping(value = "/products/{id}")
	private Product product(@PathVariable ("productid")int productid ) {
		return service.getProductById(productid);
	}


	//CREATE OPERATION
	@PostMapping(value = "/products/{id}")
	private int saveProduct(@RequestBody Product product) {
		service.saveOrUpdate(product);
		return  product.getId();
	}


	//UPDATE OPERATION
	@PutMapping(value = "/products/{id}") 
	private Product update(@RequestBody Product product) {
		service.saveOrUpdate(product);
		return product;	

	}

	//Delete operation
	@DeleteMapping
	private void deleteProduct(@PathVariable ("productid")int productid ) {
		service.deleteById(productid);
	}


}
