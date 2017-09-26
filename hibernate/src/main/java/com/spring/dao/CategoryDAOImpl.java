package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	
	private SessionFactory sessionFactory;

public CategoryDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;
	
	}/*
@Transactional
	public boolean saveProduct(Product product) {
	
	sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}
*/

public boolean saveCategory(Category category) {
	
	Session session=sessionFactory.openSession();
	session.saveOrUpdate(category);
	Transaction tx=session.beginTransaction();
	tx.commit();
	
	return true;
}
}
