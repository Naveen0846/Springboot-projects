package com.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_details")
public class ShopEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "cart_Id")
	private long cartId;
	
	@Column(name = "item_Name")
	private String itemName;
	
	@Column(name = "item_Price")
	private double itemPrice;
	
	@Column(name = "status")
	private String status;

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
