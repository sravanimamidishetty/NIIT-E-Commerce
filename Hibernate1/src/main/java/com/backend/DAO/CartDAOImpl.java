package com.backend.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.Cart;
@Repository
public class CartDAOImpl implements CartDAO {
@Autowired
SessionFactory sessionFactory;
@Transactional
public boolean addCart(Cart cart) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}
		catch(Exception e){
		
		return false;
		}
	}
@Transactional
	public boolean updateCart(Cart cart) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}
		catch(Exception e){
		
		return false;
		}
	}
@Transactional
	public boolean deleteCart(Cart cart) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}
		catch(Exception e){
		
		return false;
		}
		}
@Transactional
	public Cart getCartItem(int CartItemId) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class,CartItemId);
		session.close();
		session.flush();
		return cart;
	}
		
@Transactional
	public List<Cart> getCartItems(String username) {
		List<Cart> cart = new ArrayList<Cart>();
        Transaction trns = null;
        Session session =sessionFactory.openSession();
        try {
            trns = (Transaction) session.beginTransaction();
            cart = session.createQuery("from Cart").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return cart;
}
	}
