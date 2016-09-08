package com.divya.shopping.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.divya.shopping.entity.Category;
import com.divya.shopping.entity.Product;
import com.divya.shopping.repository.CategoryRepository;
import com.divya.shopping.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Transactional
	public List<Category> getCategory() {
		return categoryRepository.list();
	}
	@Transactional
	public void addCategory(Category category){
		categoryRepository.add(category);
	}
	@Transactional
	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
	}
	@Transactional
	public void updateCategory(Category category) {
		categoryRepository.update(category);
	}
	@Transactional
	public List<Product> getProducts(int catId) {
		categoryRepository.getProduct(catId);
		return null;
	}
	
}
