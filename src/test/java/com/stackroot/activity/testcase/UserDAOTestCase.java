package com.stackroot.activity.testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.stackroot.activity.dao.UserDAO;
import com.stackroot.activity.model.User;

public class UserDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static UserDAO userDAO;

	@Autowired
	static User user;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroot");
		context.refresh();

		// get the userDAO from context
		userDAO = (UserDAO) context.getBean("userDAO");

		// get the user from context

		user = (User) context.getBean("user");

	}
/**
 * will through DataIntegrityViolationException
 */
	@Test(expected = DataIntegrityViolationException.class)
	public void createUserFailedTestCase() {
		user.setId("Farooq");
		user.setName("Farooq");
		user.setPassword("Farooq");

		userDAO.save(user);

	}

	@Test
	public void updateUserTestCase() {
		user = new User();
		user.setId("Dinesh");
		user.setName("Dinesh");
		user.setPassword("Dinesh@123");
		boolean flag = userDAO.update(user);

		// error - if there is in runtime errors - Red mark
		// success - if expected and actual is same - green mark
		// fail - if expected and actual is different - blue mark
		assertEquals(" update user test case", true, flag);

	}

	@Test
	public void validateUSerTestCase() {

		user = userDAO.validate("Dinesh", "Dinesh@123");

		assertNotNull(user);

	}

	@Test
	public void getAllUserTestCase() {
		int actualSize = userDAO.list().size();

		// will compare actual and expected
		// if actual and expected is same - TC will pass
		// if it is different - TC fail
		assertEquals(3, actualSize);
	}

}
