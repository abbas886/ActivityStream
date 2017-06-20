package com.stackroot.activity.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroot.activity.dao.UserDAO;
import com.stackroot.activity.model.User;

public class UserDAOTestCase {

@Autowired static AnnotationConfigApplicationContext context;
	
	@Autowired  static UserDAO  userDAO;
	
	@Autowired  static User user;
	
	
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroot");
		context.refresh();
		
		//get the userDAO from context
		userDAO =  (UserDAO) context.getBean("userDAO");
		
		//get the user from context
		
		user = (User)context.getBean("user");
		
	}
	
	@Test
	public void createUserTestCase()
	{
		user.setId("Farooq");
		user.setName("Farooq");
		user.setPassword("Farooq");
		boolean flag =  userDAO.save(user);
	

		//error - if there is in runtime errors  -  Red mark
		//success  - if expected and actual is same  - green mark
		//fail  - if expected and actual is different  -  blue mark
		assertEquals("createUserTestCase",true,flag);
		
	}
	
	
	@Test
	public void updateUserTestCase()
	{
		user.setId("Dinesh");
		user.setName("Dinesh");
		user.setPassword("Dinesh@123");
		boolean flag =  userDAO.update(user);
	

		//error - if there is in runtime errors  -  Red mark
		//success  - if expected and actual is same  - green mark
		//fail  - if expected and actual is different  -  blue mark
		assertEquals(" update user test case",true,flag);
		
	}
	
	@Test
	public void validateUSerTestCase()
	{
		
		 user =  userDAO.validate("Dinesh", "Dinesh@123");
		
		
		assertNotNull( user);
		
	}
	
	@Test
	public void getAllUserTestCase()
	{
		int actualSize=   userDAO.list().size();
		
		//will compare actual and expected
		//if actual and expected is same - TC will pass
		//if it is different - TC fail
		assertEquals(3, actualSize);
	}
	
	
	
	
	

}
