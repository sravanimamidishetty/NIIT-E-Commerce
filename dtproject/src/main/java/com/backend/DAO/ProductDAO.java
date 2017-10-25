package com.backend.DAO;

import java.util.List;

import com.backend.model.Product;

public interface ProductDAO 
{


	public boolean saveProduct(Product product);
	public List<Product> list();
	public Product getProductById(int product_id);
	public Product removeProducyById(int product_id);
	public List<Product>getProductByCategory(int category_id);
	public List<Product>getProductByCategoryID(int category_id);
	public List<Product>homeList();
	
	public Product getItem(int id) ;

}