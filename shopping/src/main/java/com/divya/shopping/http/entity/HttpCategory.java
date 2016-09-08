package com.divya.shopping.http.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.divya.shopping.entity.Category;

@XmlRootElement(name = "category")
public class HttpCategory {
	public HttpCategory() {}
	public HttpCategory(Category category) {
		this.categoryId = category.getCategoryId();
		this.categoryName = category.getCategoryName();
		this.categoryPosition = category.getCategoryPosition();
		this.categoryImage = category.getCategoryImage();
	
	}
	@XmlElement
	public int categoryId;
	@XmlElement
	public String categoryName;
	@XmlElement
	public int categoryPosition;
	@XmlElement
	public String categoryImage;
}
