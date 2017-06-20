package com.stackroot.activity.testcase;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroot.activity.dao.UserStreamDAO;
import com.stackroot.activity.model.Stream;
import com.stackroot.activity.model.Stream;

public class UserStreamDAOTestCase {

@Autowired static AnnotationConfigApplicationContext context;
	
	@Autowired  static UserStreamDAO  userHomeDAO;
	
	@Autowired  static Stream stream;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroot");
		context.refresh();
		
		userHomeDAO =  (UserStreamDAO) context.getBean("userHomeDAO");
		
		
		stream = (Stream)context.getBean("stream");
	}
	
	
	//@Test
	public void getUserHomeTestCase()
	{
		List<Stream> stream = userHomeDAO.getMyInbox("Dinesh");
		System.out.println("User home streams");
		displayStreams(stream);
		assertEquals(28,  stream.size());
		
		
	}
	
	//@Test
	public void getUserHomeByCircleIDTestCase()
	{
		List<Stream> streams = userHomeDAO.getMyCircleMessages("hobes");
		System.out.println("Circle strems");
		displayStreams(streams);
		assertEquals(28,  streams.size());
		
		
	}
	
	@Test
	public void getStreamByUserIDAndRangeTestCase()
	{
		List<Stream> streams = userHomeDAO.getMyInbox("Farooq", 1,10);
		
		assertTrue(streams.size() <=10);
		
		System.out.println("First 10 of Farooq");
		System.out.println("_________________");
		displayStreams(streams);
		
	}
	
	@Test
	public void getStreamByCircleIDAndRangeTestCase()
	{
		List<Stream> streams = userHomeDAO.getMyCircleMessages("gitlab", 1,10);
		
		assertTrue(streams.size() <=10);
		
		System.out.println("First 10 records of  with circle gitlab ");
		System.out.println("_________________");
		displayStreams(streams);
		
	}
	
	
	
	private void displayStreams(List<Stream> Streams)
	{
		System.out.println("User ID \t Circle ID \t Sender \t Message \t\t\t\t Stream Type \t Date \t Tag ");
		for(Stream Stream :Streams )
		{
			System.out.print(Stream.getReceiverID() +"\t\t" + 
		                     Stream.getCircleID()+"\t\t"+
					         Stream.getSenderID()+"\t\t"+
					         Stream.getMessage() +"\t" + 
		                     Stream.getStreamType()+"\t"+
		                     Stream.getPostedDate()+"\t"+
					         Stream.getTag());
			System.out.println();
		}
		
	}
	
	
	
	
	
	
		
	

}
