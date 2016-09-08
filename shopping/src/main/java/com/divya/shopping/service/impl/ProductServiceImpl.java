package com.divya.shopping.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.shopping.entity.Product;
import com.divya.shopping.repository.ProductRepository;
import com.divya.shopping.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Transactional
	public List<Product> getProducts() {
		return productRepository.list();
	}
	@Transactional
	public void addProduct(Product product) {
		productRepository.add(product);	
	}
	@Transactional
	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}
	@Transactional
	public void updateProduct(Product product) {
		productRepository.update(product);
	}

}
