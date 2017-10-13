package com.backend.DAO;

import java.util.List;

import com.backend.model.Cart;

public interface CartDAO {
	public boolean addCart(Cart cart);
	public boolean updateCart(Cart cart);
	public boolean deleteCart(int CartItemId);
	public boolean getCartItem(int CartItemId);
	public List<Cart> getCartItems(String username);
	//public boolean retrieveCart(Cart cart);


}
