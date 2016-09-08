package com.divya.shopping.http.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.divya.shopping.entity.Product;
import com.divya.shopping.entity.impl.CategoryImpl;

@XmlRootElement(name = "product")
public class HttpProduct {
	
	@XmlElement
	public int productId;
	@XmlElement
	public String productName;
	@XmlElement
	public String productDescription;
	@XmlElement
	public int productStock;
	@XmlElement
	public double productPrice;
	@XmlElement
	public CategoryImpl category;
	public HttpProduct() {
	}
	public HttpProduct(Product product) {
		super();
		this.productId = product.getProductId();
		this.productName = product.getProductName();
		this.productDescription = product.getProductDescription();
		this.productStock = product.getProductStock();
		this.productPrice = product.getProductPrice();
		this.category = (CategoryImpl) product.getCategory();
	}
	
}
