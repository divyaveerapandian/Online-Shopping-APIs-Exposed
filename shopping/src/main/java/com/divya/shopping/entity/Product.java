package com.divya.shopping.entity;

public interface Product {

	int getProductId();
	String getProductName();
	int getProductStock();
	String getProductDescription();
	double getProductPrice();
	Category getCategory();
}
