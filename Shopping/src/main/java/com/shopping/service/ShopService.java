package com.shopping.service;

import java.util.List;

import com.shopping.entity.ShopEntity;

public interface ShopService {

	public List<ShopEntity> saveItem(List<ShopEntity> shopEntity);
	
	public List<ShopEntity> getAllItem();
	
	public ShopEntity getItemById(long cartId) ;
	
	public ShopEntity updateItem(ShopEntity shopEntity);
	
	public void deleteItemById(long cartId);
	
}
