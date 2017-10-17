/*package com.spring.test;
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
	@Autowired
	private static Product product;
	
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
	//@Ignore
	@Test
	public void addProduct()
	{
		Product product =new Product();
		product.setProduct_name("ios");
		product.setProduct_quantity(6);
		product.setProduct_price(7000);
		boolean flag=productDAO.saveProduct(product);
		assertEquals("createProductTestCase", true, flag);
	}
	
}
*/

