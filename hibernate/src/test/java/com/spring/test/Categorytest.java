package com.spring.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.spring.config.DBConfig;
import com.spring.dao.CategoryDAO;
import com.spring.dao.ProductDAO;
import com.spring.model.Category;




@ComponentScan("com.spring")
public class Categorytest {
	
	
	@Autowired
	private static Category category;
	

	@Autowired
	private static CategoryDAO categoryDAO;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.spring.*");
		context.refresh();
		
		category=(Category) context.getBean("category");
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
	
	}
	@Test
	public void createCategory()
	{
	
		category.setName("Cadbury");
		
		
		boolean flag=categoryDAO.saveCategory(category);
		
		assertEquals("createCategoryTestCase", true, flag);
		
		
	}
	
}
	
	
	

