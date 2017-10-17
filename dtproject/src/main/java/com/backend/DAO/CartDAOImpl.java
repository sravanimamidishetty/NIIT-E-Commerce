package com.backend.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transaction;

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
//public CartDAOImpl(SessionFactory sessionFactory) {
	//this.sessionFactory=sessionFactory;
//}
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
public boolean deleteCart(int CartItemId) {
	try{
		sessionFactory.getCurrentSession().createQuery("DELETE FROM CART WHERE CartItemId = "+CartItemId).executeUpdate();
		return true;
	}
	catch(Exception e){

	return false;
	}
	}
@SuppressWarnings("rawtypes")
@Transactional
public boolean getCartItem(int CartItemId) {
	Session session=sessionFactory.openSession();
	Query q=session.createQuery("from Cart cart");
	List l=q.getResultList();
	System.out.println("Totaal number of records:"+l.size());;
	Iterator it=l.iterator();
	 
	while(it.hasNext())
	 {
		 Object o = (Object)it.next();
		Cart cart = (Cart)o;
		 System.out.println("Cart CartItemId : "+cart.getCartItemId());
		 System.out.println("Cart Username : "+cart.getUsername());
		 System.out.println("Cart Quantity : "+cart.getQuantity());
		 System.out.println("Cart Price : "+cart.getPrice());
		 System.out.println("----------------------");
	 } 
	return true;
}
		
@SuppressWarnings({ "unchecked", "unused" })
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
/*public boolean getProduct(int id) {
	Session session=sessionFactory.openSession();
	Query q=session.createQuery("from Product p");
	List l=q.getResultList();
	System.out.println("Totaal number of records:"+l.size());;
	Iterator it=l.iterator();
	 
	while(it.hasNext())
	 {
		 Object o = (Object)it.next();
		 Product p = (Product)o;
		 System.out.println("Product id : "+p.getId());
		 System.out.println("Product Name : "+p.getName());
		 System.out.println("Product Quantity : "+p.getQuantity());
		 System.out.println("Product Price : "+p.getPrice());
		 System.out.println("----------------------");
	 } 
	return true;*/
}
	
