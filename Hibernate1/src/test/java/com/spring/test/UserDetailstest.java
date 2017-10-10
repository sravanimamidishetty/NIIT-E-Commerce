package com.spring.test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.backend.config.Dbconfig;
import com.backend.model.UserDetails;
import com.backend.DAO.UserDetailsDAO;


@SuppressWarnings("unused")
@ComponentScan("com.spring")
public class UserDetailstest
{	
	//@Autowired
	//private static UserDetails userdetails;
	
	@Autowired
	private static UserDetailsDAO userdetailsDAO;
	
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.register(Dbconfig.class);
		context.refresh();
		
		//userdetails=(UserDetails) context.getBean("userdetails");
		userdetailsDAO=(UserDetailsDAO) context.getBean("userdetailsDAO");
		
		
	}
	@Test
	public void createUserdetails()
	{
		UserDetails userdetails =new UserDetails();
		userdetails.setUsername("IOS");
		userdetails.setPassword("12345");
		userdetails.setRole("admin");
		userdetails.setCustomername("flipkart");
		userdetails.setAddress("warangal");
		
		boolean flag=userdetailsDAO.saveUserDetails(userdetails);
		assertEquals("createUserDetailstestCase", true, flag);
	}
}


