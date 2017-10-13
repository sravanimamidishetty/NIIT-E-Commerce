package com.backend.DAO;



import java.util.List;

import com.backend.model.Cart;
import com.backend.model.Product;

public interface ProductDAO 
{
	public boolean addProduct(Product p);
	public boolean updateProduct(Product p);
	public boolean deleteProduct(int id);
	public boolean getProduct(int id);
	//public List<Product> getAllProduct(String name);

}