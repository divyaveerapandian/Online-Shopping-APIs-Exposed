package com.divya.shopping.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.divya.shopping.entity.Product;
import com.divya.shopping.entity.impl.ProductImpl;
import com.divya.shopping.repository.ProductRepository;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	public List<Product> list() {
		return sessionFactory.getCurrentSession().createCriteria(ProductImpl.class).list();
	}
	
	public void add(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}
	
	public void delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
	}

	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}

}
