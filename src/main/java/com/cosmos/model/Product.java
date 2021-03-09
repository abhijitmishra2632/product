package com.cosmos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product003")
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
	private Float productAmount;
	private Float productMRP;
	private Float productRealPrice;
	private Float productSellingPrice;
	private boolean active;
	private LocalDate now;
	private boolean addedToCart;

}
