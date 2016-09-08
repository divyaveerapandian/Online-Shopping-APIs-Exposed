package com.divya.shopping.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.divya.shopping.entity.Category;
import com.divya.shopping.entity.Product;

@Entity
@Table(name = "Product")
public class ProductImpl implements Product{
	@Id
	@Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@Column
	private int productStock;
	@Column
	private double productPrice;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = CategoryImpl.class)
	@JoinColumn(name = "categoryId")
	private Category category;
	
	public ProductImpl() {
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductStock() {
		return productStock;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		
		return "Product Id : " + productId + " Product Name : " + productName +
				" Product Position : " + productDescription;
	}
}
