package com.backend.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Cart;
@Repository
public class paymentDAOImpl implements paymentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public paymentDAOImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Cart> getTotal(int uid) {
		
		return (List<Cart>) sessionFactory.getCurrentSession()
				.createQuery("select sum(subTotal) from Cart where userid="+uid).list();

	}
}
