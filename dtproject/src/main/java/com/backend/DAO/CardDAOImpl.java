package com.backend.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Card;
@Repository
public class CardDAOImpl implements CardDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public CardDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory; 
		
	}
	@Transactional
	public boolean saveCard(Card card) {
		// TODO Auto-generated method stub
sessionFactory.getCurrentSession().saveOrUpdate(card);
		
		return true;
	}

}