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
import com.backend.DAO.ProductDAO;
import com.backend.model.Product;

@SuppressWarnings("unused")
@ComponentScan("com.spring")
@Ignore
public class Producttest 
{	
	/*@Autowired
	private static Product product;
	*/
	@Autowired
	private static ProductDAO productDAO;
		
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.register(Dbconfig.class);
		context.refresh();
		
	//	product=(Product) context.getBean("product");
		productDAO=(ProductDAO) context.getBean("productDAO");
		
		
	}
	@Ignore
	@Test
	public void addProduct()
	{
		Product product =new Product();
		product.setName("iphone 7");
		product.setQuantity(1);
		product.setPrice(72000);
		
	
		boolean flag=productDAO.addProduct(product);
		assertEquals("createProductTestCase", true, flag);
	}
	//@Ignore
	@Test
	public void updateProduct()
	{
		Product product =new Product();
		product.setName("iphone 7");
		product.setQuantity(5);
		product.setPrice(72000);
		
	
		boolean flag=productDAO.updateProduct(product);
		assertEquals("createProductTestCase", true, flag);
	}
}


