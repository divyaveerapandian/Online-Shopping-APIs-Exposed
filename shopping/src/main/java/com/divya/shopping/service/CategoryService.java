package com.divya.shopping.service;

import java.util.List;

import com.divya.shopping.entity.Category;
import com.divya.shopping.entity.Product;

public interface CategoryService {

	public List<Category> getCategory();
	public void addCategory(Category category);
	public void deleteCategory(Category category);
	public void updateCategory(Category category);
	public List<Product> getProducts(int catId);
}
