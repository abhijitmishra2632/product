package com.cosmos.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "product001")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String productCategory;
	private String productType;
	private String productBrand;
	private String productStore;
	private String productUnit;
	private int productAmount;
	private int productMRP;
	private int productRealPrice;
	private int productSellingPrice;
	private boolean active;
	private LocalDate now;
	private boolean addedToCart;
		
	public boolean isAddedToCart() {
		return addedToCart;
	}

	public void setAddedToCart(boolean addedToCart) {
		this.addedToCart = addedToCart;
	}

	public String getProductStore() {
		return productStore;
	}

	public void setProductStore(String productStore) {
		this.productStore = productStore;
	}

	

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public LocalDate getNow() {
		return now;
	}

	public void setNow(LocalDate now) {
		this.now = now;
	}

	public Product() {
		super();
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(int productMRP) {
		this.productMRP = productMRP;
	}
	public int getProductRealPrice() {
		return productRealPrice;
	}
	public void setProductRealPrice(int productRealPrice) {
		this.productRealPrice = productRealPrice;
	}
	public int getProductSellingPrice() {
		return productSellingPrice;
	}
	public void setProductSellingPrice(int productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}


}
