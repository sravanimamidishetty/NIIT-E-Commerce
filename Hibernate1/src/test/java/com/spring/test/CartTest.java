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
import com.backend.DAO.CartDAO;
import com.backend.DAO.ProductDAO;
import com.backend.model.Cart;
import com.backend.model.Product;

@SuppressWarnings("unused")
@ComponentScan("com.spring")
public class CartTest 
{	
	/*@Autowired
	private static Product product;
	*/
	@Autowired
	private static CartDAO cartDAO;
	
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.register(Dbconfig.class);
		context.refresh();
		
	//	product=(Product) context.getBean("product");
		cartDAO=(CartDAO) context.getBean("cartDAO");
		
		
	}
	@Ignore
	@Test
	public void addCart()
	{
		Cart cart=new Cart();
		cart.setCartItemId(1);
		cart.setOrderId(124);
		cart.setPrice(2500);
		cart.setProductId(124);
		cart.setQuantity(3);
		cart.setUsername("NP");
		cart.setUsername("sravani");
	
		boolean flag=cartDAO.addCart(cart);
		assertEquals("createCartTestCase", true, flag);
	}
	@Ignore
	@Test
	public void updateCart()
	{
		Cart cart=new Cart();
		cart.setCartItemId(1);
		cart.setOrderId(135);
		cart.setPrice(2500);
		cart.setProductId(135);
		cart.setQuantity(3);
		cart.setStatus("NP");
		cart.setUsername("sravani");
	
		//boolean flag=cartDAO.updateCart(cart);
		assertEquals("problem in cart", cartDAO.updateCart(cart));
	}
	//@Ignore
	@Test
	public void deleteCart()
	{
		Cart cart=new Cart();
		cart.setCartItemId(1);
		cart.setOrderId(124);
		cart.setPrice(2500);
		cart.setProductId(124);
		cart.setQuantity(3);
		cart.setStatus("NP");
		cart.setUsername("sravani");
	
		boolean flag=cartDAO.deleteCart(cart);
		assertEquals("createCartTestCase", true, flag);
	}
	
}


