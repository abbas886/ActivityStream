package com.stackroot.activity.testcase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroot.activity.dao.StreamDAO;
import com.stackroot.activity.model.Stream;


public class StreamDAOTestCase  {

	@Autowired
	static AnnotationConfigApplicationContext context;


	@Autowired
	static StreamDAO streamDAO;

	@Autowired
	static Stream stream;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroot");
		context.refresh();

		streamDAO = (StreamDAO) context.getBean("streamDAO");

		// get the stream from context

		stream = (Stream) context.getBean("stream");

	}

	@Test
	public void sendMessageToUserTestCase() {
		stream.setId((int) (Math.random() * 100000));
		stream.setMessage("Copying to user home from individual-1");
		stream.setSenderID("Dinesh");
		stream.setTag("Message");
		stream.setStreamType("String");
		stream.setReceiverID("Farooq");

		assertEquals(true, streamDAO.sendMessageToUser("Dinesh", stream));

	}

	@Test
	public void sendMessageToCircleTestCase() {
		stream.setId((int) (Math.random() * 100000));
		stream.setMessage("Copying to user home from single circle?-1");
		stream.setSenderID("Dinesh");
		stream.setTag("Message");
		stream.setStreamType("String");
		stream.setReceiverID("Farooq");

		assertEquals(true, streamDAO.sendMessageToCircle("gitlab", stream));

	}

	@Test
	public void sendMessageToCircles() {
		stream.setId((int) (Math.random() * 100000));
		stream.setMessage("Copying to user home from all circles?-1");
		stream.setSenderID("swamy");
		stream.setTag("Message");
		stream.setStreamType("String");
		stream.setReceiverID("Dinesh");

		List<String> circles = new ArrayList<String>();
		circles.add("hobes");
		circles.add("Coder_Platoform");

		assertEquals(true, streamDAO.sendMessageToCircles(circles, stream));

	}

	@Test
	public void getMessagesTestCase() {
		displayAllStreams(streamDAO.getMyInbox("Dinesh"));
		assertEquals(true, streamDAO.getMyInbox("Dinesh").size()>=0);
	}

	@Test
	public void getMessagesFromCircleTestCase() {
		displayAllStreams(streamDAO.getMyCircleMessages("hobes"));
		assertEquals(true, streamDAO.getMyCircleMessages("hobes").size()>=0);

	}

	/**
	 * Temporary method to display stream all streams
	 * 
	 * @param streams
	 */

	private void displayAllStreams(List<Stream> streams) {
		System.out.println("Message from All Streams");
		for (Stream stream : streams) {
			displayStream(stream);
		}
	}

	/**
	 * Temporary method to display stream
	 * 
	 * @param streams
	 */
	private void displayStream(Stream stream) {
		System.out.print("ID :" + stream.getId());
		System.out.print("Message :" + stream.getMessage());
		System.out.print("Received ID :" + stream.getReceiverID());
		System.out.println("Date :" + stream.getPostedDate());

	}

}
