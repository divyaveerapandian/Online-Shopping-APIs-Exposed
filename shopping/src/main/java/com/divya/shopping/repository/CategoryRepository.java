package com.divya.shopping.repository;

import java.util.List;

import com.divya.shopping.entity.Category;

public interface CategoryRepository {

	public List<Category> list();
	public int add(Category category);
	public void delete(Category category);
	public void update(Category category);
	public void getProduct(int catId);
}
