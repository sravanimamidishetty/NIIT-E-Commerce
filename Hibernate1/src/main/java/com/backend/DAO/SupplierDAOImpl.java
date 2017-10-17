package com.backend.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.Supplier;

@SuppressWarnings("deprecation")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean saveSupplier(Supplier supplier) {
		
		 sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		 return true;
	}
		@Transactional
		public List<Supplier> list() {
			@SuppressWarnings({ "unchecked" })
			List<Supplier> listSupplier = (List<Supplier>) sessionFactory.getCurrentSession()
					.createCriteria(Supplier.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listSupplier;
		}
		@Transactional
		public Supplier getSupplierById(int supplier_id) {
			String hql = "from"+"Supplier"+" where id=" + supplier_id;
			@SuppressWarnings({ "rawtypes" })
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			
			@SuppressWarnings({ "unchecked" })
			List<Supplier> listSupplier = (List<Supplier>) query.list();
			
			if (listSupplier != null && !listSupplier.isEmpty()) {
				return listSupplier.get(0);
			}
			
			return null;
		}
		@Transactional
		public Supplier removeSupplierById(int supplier_id) {
			Supplier SupplierToDelete = new Supplier();
			SupplierToDelete.setSupplier_id(supplier_id);
			sessionFactory.getCurrentSession().delete(SupplierToDelete);
			return SupplierToDelete;
		}




}
