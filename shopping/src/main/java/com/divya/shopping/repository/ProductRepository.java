package com.divya.shopping.repository;

import java.util.List;

import com.divya.shopping.entity.Product;

public interface ProductRepository {
	public List<Product> list();
	public void add(Product product);
	public void delete(Product product);
	public void update(Product product);
}
