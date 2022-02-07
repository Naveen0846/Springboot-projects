package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.ShopEntity;
import com.shopping.exceptions.CartIdNotFoundException;
import com.shopping.exceptions.ItemAldreadyExistsExceptions;
import com.shopping.service.ShopService;

@RestController
@RequestMapping(value = "/shop")
public class ShopController {

	@Autowired
	private ShopService shopService;
	
	//saving item 
	@PostMapping(value = "/item")
	public ResponseEntity<?> saveItem(@RequestBody List<ShopEntity> shopEntity){
		try {
			return new ResponseEntity(shopService.saveItem(shopEntity),HttpStatus.OK);
		}catch(ItemAldreadyExistsExceptions ce) {
			return new ResponseEntity(ce.getMessage(), HttpStatus.OK);
		}
	}
	
	//get all items
	@GetMapping(value = "/cart")
	public List<ShopEntity> getAllItem(){
		return shopService.getAllItem();
	}
	
	//get items by id
	@GetMapping(value = "/getcart/{cartId}")
	public ResponseEntity<ShopEntity> getItemById(@PathVariable(value = "cartId")long cartId)  {
		try {
			return new ResponseEntity(shopService.getItemById(cartId),HttpStatus.OK);
		}catch(CartIdNotFoundException ce) {
			return new ResponseEntity(ce.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	//update the existing data by id
	@PutMapping(value = "/getcart")
	public ResponseEntity<ShopEntity> updateItem(@RequestBody ShopEntity shopEntity){
		try {
			return new ResponseEntity(shopService.updateItem(shopEntity),HttpStatus.OK);
		}catch (ItemAldreadyExistsExceptions ie) {
			return new ResponseEntity(ie.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	//delete by id
	@DeleteMapping("/getcart/{cartId}")
	public  ResponseEntity<String> deleteItemById(@PathVariable (value = "cartId")long cartId){
		shopService.deleteItemById(cartId);
		return new ResponseEntity<String>("item deleted successfully for id:", HttpStatus.OK);
	}
	
}
 