package net.products.stack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import net.products.stack.ProductsApplication;
import net.products.stack.entity.Product;
import net.products.stack.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	//GET ALL PRODUCTS
	public List<Product> getAllProduct() {
		List<Product> product = new ArrayList<Product>();
		productRepository.findAll().forEach(product1 -> product.add(product1));
		return product;
	}


	//get all by id
	public  Product getProductById(int id) {
		return productRepository.findById(id).get();
	}
	
	
	//save
	public void saveOrUpdate(Product product) {
		productRepository.save(product);	
	}
	
	//delete
	public void deleteById(int id) {
		productRepository.deleteById(id);
	}
	
	//update existing record
	public void update(Product product, int productid) {
		productRepository.save(product);
	}	
	}