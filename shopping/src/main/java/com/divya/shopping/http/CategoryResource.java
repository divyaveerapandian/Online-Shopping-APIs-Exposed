package com.divya.shopping.http;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divya.shopping.entity.Category;
import com.divya.shopping.entity.Product;
import com.divya.shopping.entity.impl.CategoryImpl;
import com.divya.shopping.http.entity.HttpCategory;
import com.divya.shopping.http.entity.HttpProduct;
import com.divya.shopping.service.CategoryService;

@Path("categories")
@Component
@Consumes( MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoryResource {
	@Autowired
	private CategoryService categoryService;
	
	@GET
	public List<HttpCategory> getAllCategory(){
		List<Category> categories = categoryService.getCategory();
		List<HttpCategory> httpcategories = convert(categories);
		return httpcategories;
	}
	@GET
	@Path("/{categoryId}")
	public List<HttpProduct> getAllProductForACategory(@PathParam("categoryId") int catId ){
		List<Product> products = categoryService.getProducts(catId);
		List<HttpProduct> httpProducts = ProductResource.convert(products);
		return httpProducts;
		
	}
	@POST
	public HttpCategory addCategory(HttpCategory httpcategory){
		categoryService.addCategory(convert(httpcategory));
		return httpcategory;
	}
	
	@DELETE
	public void deleteCategory(HttpCategory httpcategory){
		categoryService.deleteCategory(convert(httpcategory));
	}
	@PUT
	public void updateCategory(HttpCategory httpcategory){
		categoryService.updateCategory(convert(httpcategory));
	}
	
	private List<HttpCategory> convert(List<Category> categories){
		List<HttpCategory> httpcategories = new ArrayList<>();
		for(Category category : categories){
			HttpCategory  httpcategory = new HttpCategory(category);
			httpcategories.add(httpcategory);
		}
		return httpcategories;
	}
	private Category convert(HttpCategory httpcategory) {
		CategoryImpl category =  new CategoryImpl();
		category.setCategoryId(httpcategory.categoryId);
		category.setCategoryName(httpcategory.categoryName);
		category.setCategoryPosition(httpcategory.categoryPosition);
		category.setCategoryImage(httpcategory.categoryImage);
		return category;
	}
	
}
