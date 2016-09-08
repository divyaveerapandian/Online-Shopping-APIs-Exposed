package com.divya.shopping.service;

import java.util.List;
import com.divya.shopping.entity.Product;

public interface ProductService {
	public List<Product> getProducts();
	public void addProduct(Product product);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
}
