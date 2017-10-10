package com.backend.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.UserDetails;
@Repository
public class UserDetailsDAOImpl implements UserDetailsDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public UserDetailsDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

@Ignore
@Transactional
	public List getAllUserDetails() {
		return sessionFactory.getCurrentSession().createQuery("from UserDetails").list();
	}
@Transactional
public boolean saveUserDetails(UserDetails userdetails) {
	// TODO Auto-generated method stub
	Session s1=sessionFactory.openSession();
	s1.saveOrUpdate(userdetails);
	Transaction t=s1.beginTransaction();
	s1.flush();
	s1.close();
	t.commit();
	return true;
}


}
