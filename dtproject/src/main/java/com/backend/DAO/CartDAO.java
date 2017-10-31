package com.backend.DAO;

import java.util.List;

import com.backend.model.Cart;

public interface CartDAO {
public boolean saveProductToCart(Cart cart);
	
	public Cart getitem(int prodId,int userid);
	
	public List<Cart>listCart();
	public void removeCartById(int userid);
	
	public long cartsize(int userid) ;
	
	public double CartPrice(int userid) ;

	public Cart editCartById(int cart_id);
	public Cart getCartById(int cart_id);
	public List<Cart>getCart(int userid);
	public void getCartByStatus(int userid);

}
