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
import com.spring.dao.ProductDAO;
import com.spring.model.Product;



@ComponentScan("com.spring")
public class ProductTest {
	
	
	@Autowired
	private static Product product;
	

	@Autowired
	private static ProductDAO productDAO;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.spring.*");
		context.refresh();
		
		product=(Product) context.getBean("product");
		productDAO=(ProductDAO) context.getBean("productDAO");
	
	}
	@Test
	public void createProduct()
	{
	
		product.setName("cholocalte");
		product.setDescription("cadbury");
		product.setPrice(2500);
		
		boolean flag=productDAO.saveProduct(product);
		
		assertEquals("createProductTestCase", true, flag);
		
		
	}
	
	
	
	
	

}