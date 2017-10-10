package com.backend.DAO;



import java.util.List;

import com.backend.model.Category;

public interface CategoryDAO 
{
	public boolean saveCategory(Category c);
	public  List getAllCategory();
}