package com.backend.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}

@Transactional
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Persisting Product object started.........");
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("Product has been saved successfully....");
		return true;
	}
@SuppressWarnings({ "unchecked" })
@Transactional
	public List<Product> list() {
		// TODO Auto-generated method stub
		List<Product> product = sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		return product;
	}


@Transactional
	public Product getProductById(int product_id) {
	String hql = "from" + " Product" + " where id=" + product_id;
	@SuppressWarnings("rawtypes")
	Query query = sessionFactory.getCurrentSession().createQuery(hql);

	@SuppressWarnings("unchecked")
	List<Product> listProduct = (List<Product>) query.list();

	if (listProduct != null && !listProduct.isEmpty()) {
		return listProduct.get(0);
	}

	return null;
}


@SuppressWarnings({ "unchecked"})
@Transactional
	public Product removeProducyById(int product_id) {
		// TODO Auto-generated method stub
		Product ProductToDelete = new Product();
		ProductToDelete.setId(product_id);
		sessionFactory.getCurrentSession().delete(ProductToDelete);
		return ProductToDelete;
	}

@SuppressWarnings({ "unchecked", "rawtypes" })
@Transactional
	public List<Product> getProductByCategory(int category_id) {
		// TODO Auto-generated method stub
		String hql = "from" + " Product" + " where id=" +category_id;
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		
		List<Product> listProduct = (List<Product>) ((ProductDAOImpl) query).list();

		if (listProduct != null && !listProduct.isEmpty()) {
			return (List<Product>) listProduct.get(0);
		}
		return null;
	}

@Transactional
   public List<Product> getProductByCategoryID(int category_id) {
		// TODO Auto-generated method stub
		String hql = "from Product where category_id= "+category_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> catproducts = (List<Product>) ((ProductDAOImpl) query).list();
		return catproducts;
	}

@Transactional
	public List<Product> homeList() {
		// TODO Auto-generated method stub
	/*	String hql="from Product ORDER BY RAND()";
		@SuppressWarnings("rawtypes")
		Query query=sessionFactory.getCurrentSession().createQuery(hql).setMaxResults(6);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) ((ProductDAOImpl) query).list();
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct;
		}
		*/
		return null;
	}
	
@Transactional
public Product getItem(int id) {
	
	
Product product=sessionFactory.getCurrentSession().get(Product.class, id);
	
	 return product;
     
}



}