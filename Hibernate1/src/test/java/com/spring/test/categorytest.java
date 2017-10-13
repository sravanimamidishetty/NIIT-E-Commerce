package com.spring.test;
import static org.junit.Assert.*;
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


@SuppressWarnings("unused")
@ComponentScan("com.spring")
@Ignore
public class categorytest 
{	
	/*@Autowired
	private static Product product;
	*/
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
	@Test
	public void createCategory()
	{
		Category category =new Category();
		category.setName("IOS");
		category.setDescription("mobile");
		
		
	
		boolean flag=categoryDAO.saveCategory(category);
		assertEquals("createCategorytestCase", true, flag);
	}
}


