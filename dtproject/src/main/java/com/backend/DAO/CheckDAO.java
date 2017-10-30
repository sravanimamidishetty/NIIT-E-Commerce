package com.backend.DAO;

import java.util.List;

import com.backend.model.Cart;

public interface CheckDAO {
	public List<Cart> getTotal(int uid);
}