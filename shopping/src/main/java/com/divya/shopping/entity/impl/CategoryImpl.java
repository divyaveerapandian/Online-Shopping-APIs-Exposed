package com.divya.shopping.entity.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.divya.shopping.entity.Category;
import com.divya.shopping.entity.Product;

@Entity
@Table(name="Category")
public class CategoryImpl implements Category {
	
	@Id
	@Column(name="categoryId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	@Column
	private String categoryName;
	@Column
	private int categoryPosition;
	@Column
	private String categoryImage;
	
	@OneToMany(mappedBy = "category", targetEntity = ProductImpl.class, cascade = CascadeType.ALL)
    private List<Product> product ;
	
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(Product prd) {
		if(this.product==null){
			this.product = new ArrayList<Product>();
		}
		this.product.add(prd);
	}

	public CategoryImpl(){}
	
	public CategoryImpl(int categoryId, String categoryName, int categoryPosition, List<Product> product) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryPosition = categoryPosition;
		this.product = product;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setCategoryPosition(int categoryPosition) {
		this.categoryPosition = categoryPosition;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public int getCategoryPosition() {
		return categoryPosition;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	
	@Override
	public String toString() {
		
		return "Category Id : " + categoryId + " Category Name : " + categoryName +
				" Category Position : " + categoryPosition;
	}

}
