package com.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repository.ShopRepository;
import com.shopping.entity.ShopEntity;
import com.shopping.exceptions.CartIdNotFoundException;
import com.shopping.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository shopRepository;

	@Override
	public List<ShopEntity> saveItem(List<ShopEntity> shopEntity) {
		List<ShopEntity> shEntity =  new ArrayList<>();
		List<ShopEntity> save = shopRepository.saveAll(shopEntity);
		return save;
	}
		/*
		 * for (Iterator iterator = shopEntity.iterator(); iterator.hasNext();) { Object
		 * next = iterator.next(); ShopEntity shoEntity = null; ShopEntity shopEntity2 =
		 * (ShopEntity) iterator.next(); {
		 * if(shopRepository.existsById(shopEntity2.getCartId())) { throw new
		 * ItemAldreadyExistsExceptions(" " ,
		 * "Code : 204---Item Aldready exists in Db with same Id "); } shoEntity =
		 * shopRepository.save(shopEntity2); } shEntity.add(shoEntity); }
		 */
		
	


	@Override
	//to get all items from Db
	public List<ShopEntity> getAllItem() {
		return  shopRepository.findAll();
	}

	@Override
	//get items by itemId
	public ShopEntity getItemById(long cartId) {
		if(shopRepository.findById(cartId) == null) {
			throw new CartIdNotFoundException(" ", "Code :204--->> Id Does Not exist in DB CONTACT DEVELOPER**");
		} 
		return shopRepository.findById(cartId).get();
	}
	
	
	@Override
	public ShopEntity updateItem(ShopEntity shopEntity) {
		return shopRepository.save(shopEntity);
	}

	@Override
	public void deleteItemById(long cartId) {
		shopRepository.deleteById(cartId); 

	}


}
