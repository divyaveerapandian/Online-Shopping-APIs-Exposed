package com.divya.shopping;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.divya.shopping.entity.Category;
import com.divya.shopping.service.CategoryService;

@ContextConfiguration(locations = ("classpath:spring-context.xml"))
public class TestCategory extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private CategoryService categoryService;

	@Test
	public void testGetCategory(){
		List<Category> categories = categoryService.getCategory();
		for(Category category : categories){
			System.out.println(category.toString());
		}
	}
}
