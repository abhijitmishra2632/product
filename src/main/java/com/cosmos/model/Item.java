package com.cosmos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="item001")
public class Item {
	@Id
	private int productId;
	private int quantityOfProduct;
	@ManyToOne
	@JoinColumn(name = "mobileNumber")
	@JsonBackReference
	private UserCart cart;
	
	public Item() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantityOfProduct() {
		return quantityOfProduct;
	}
	public void setQuantityOfProduct(int quantityOfProduct) {
		this.quantityOfProduct = quantityOfProduct;
	}
	public UserCart getCart() {
		return cart;
	}
	public void setCart(UserCart cart) {
		this.cart = cart;
	}	

}
