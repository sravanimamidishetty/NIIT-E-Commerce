/*package com.spring.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.backend.config.Dbconfig;
import com.backend.DAO.CategoryDAO;

import com.backend.model.Category;

@Ignore
@SuppressWarnings("unused")
@ComponentScan("com.spring")

public class categorytest 
{	
	@Autowired
	private static Product product;
	
	@Autowired
	private static CategoryDAO categoryDAO;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.register(Dbconfig.class);
		context.refresh();
		
	//	product=(Product) context.getBean("product");
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		
		
	}
	@Ignore
	@Test
	public void createCategory()
	{
		Category category =new Category();
		category.setCategory_name("ios");
		category.setCategory_description("mobile");
		boolean flag=categoryDAO.saveCategory(category);
		assertEquals("createCategorytestCase", true, flag);
	}
	@Ignore
	@Test
	public void updateCategory()
	{
		Category category=new Category();
		category.setCategory_name("ios");
		category.setCategory_description("mobiles");
		assertEquals("problem in cart", categoryDAO.updateCategory(1));
	}
}

*/
