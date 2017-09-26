package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	
	@Autowired
	
	private SessionFactory sessionFactory;

public ProductDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;
	
	}/*
@Transactional
	public boolean saveProduct(Product product) {
	
	sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}
*/

public boolean saveProduct(Product product) {
	
	Session session=sessionFactory.openSession();
	session.saveOrUpdate(product);
	Transaction tx=session.beginTransaction();
	tx.commit();
	
	return true;
}
}
