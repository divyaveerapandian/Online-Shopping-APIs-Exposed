package com.divya.shopping;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.divya.shopping.entity.Product;
import com.divya.shopping.service.ProductService;

@ContextConfiguration(locations = "classpath:spring-context.xml")
public class TestProduct extends AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private ProductService productService;
	@Test
	public void testGetProducts(){
		List<Product> products = productService.getProducts();
		for(Product product : products){
			System.out.println(product.toString());
		}
	}
}
