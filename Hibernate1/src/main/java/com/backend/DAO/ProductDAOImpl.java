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
import com.backend.model.Product;
@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean addProduct(Product p) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(p);
			return true;
		}
		catch(Exception e){
		
		return false;
		}
	}
@Transactional
	public boolean updateProduct(Product p) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(p);
			return true;
		}
		catch(Exception e){
		
		return false;
		}
	}
@Transactional
	public boolean deleteProduct(int id) {
		try{
			sessionFactory.getCurrentSession().createQuery("DELETE FROM PRODUCT WHERE Id = "+id).executeUpdate();
			return true;
		}
		catch(Exception e){
		
		return false;
		}
	}
@Transactional
public boolean getProduct(int id) {
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
	return true;
}

@Transactional
	public List<Product> getAllProduct(String name) {
		List<Product> product = new ArrayList<Product>();
        Transaction trns = null;
        Session session =sessionFactory.openSession();
        try {
            trns = (Transaction) session.beginTransaction();
            product = session.createQuery("from Product").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return product;
	}

}
