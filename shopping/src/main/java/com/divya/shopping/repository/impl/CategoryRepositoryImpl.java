package com.divya.shopping.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.divya.shopping.entity.Category;
import com.divya.shopping.entity.impl.CategoryImpl;
import com.divya.shopping.entity.impl.ProductImpl;
import com.divya.shopping.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory ;
	}
	@SuppressWarnings("unchecked")
	public List<Category> list() {
		return sessionFactory.getCurrentSession().createCriteria(CategoryImpl.class).list();
	}
	public int add(Category category) {
		return (int) sessionFactory.getCurrentSession().save(category);
	}
	@Override
	public void delete(Category category) {
		sessionFactory.getCurrentSession().delete(category);
	}
	@Override
	public void update(Category category) {
		sessionFactory.getCurrentSession().update(category);
	}
	@Override
	public void getProduct(int catId) {
		sessionFactory.getCurrentSession().createCriteria(ProductImpl.class)
		.add(Restrictions.eq("catId", catId));
		
	}

}
