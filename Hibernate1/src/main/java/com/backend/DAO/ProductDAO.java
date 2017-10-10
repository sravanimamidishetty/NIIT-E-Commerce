package com.backend.DAO;



import java.util.List;

import com.backend.model.Product;

public interface ProductDAO 
{
	public boolean saveProduct(Product p);
	public  List getAllProduct();
}