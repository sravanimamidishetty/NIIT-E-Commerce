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
	
	private SessionFactory sessionFactory;

	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public boolean saveProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Product> list() {
	
		List<Product>productlist=sessionFactory.getCurrentSession().createQuery("from Product").list();
		return productlist;
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


	@Transactional
	public Product removeProducyById(int product_id) {
		Product ProductToDelete = new Product();
		ProductToDelete.setId(product_id);
		sessionFactory.getCurrentSession().delete(ProductToDelete);
		return ProductToDelete;
	}

	
	
}