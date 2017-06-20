package com.stackroot.activity.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroot.activity.dao.CircleDAO;
import com.stackroot.activity.dao.StreamDAO;
import com.stackroot.activity.model.Circle;
import com.stackroot.activity.model.Stream;
import com.stackroot.activity.model.StreamCircle;


@Repository("streamDAO")
@Transactional
public class StreamDAOImpl implements StreamDAO{
	private static final Logger logger = LoggerFactory.getLogger(StreamDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired  private CircleDAO circleDAO;
	
	public StreamDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public List<Stream> getMessages(List<String> circleNames) {
		// TODO Auto-generated method stub
		return null;
	}

	private Circle getCircleByName(String circleName)
	{
		return (Circle) getCurrentSession().createCriteria(Circle.class)
		 	.add(Restrictions.eq("name", circleName)).uniqueResult();
	}

	public boolean sendMessageToCircle(String circleName, Stream stream) {
		try {
			stream.setCurrentDate();
			getCurrentSession().save(stream);
			StreamCircle streamCircle = new StreamCircle();
			streamCircle.setId((int)( Math.random()*1000000));
			streamCircle.setStreamID(stream.getId());
			if(getCircleByName(circleName)==null)
			{
				return false;
			}
			streamCircle.setCircleID(getCircleByName(circleName).getId());
			getCurrentSession().save(streamCircle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean sendMessage(Stream stream) {
		try {
			
			getCurrentSession().save(stream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

	public boolean sendMessageToUser(String receiverID, Stream stream) {
		try {
			stream.setReceiverID(receiverID);
			getCurrentSession().save(stream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean sendMessageToCircles(List<String> circleNames, Stream stream) {
		try {
			for(String circleName : circleNames)
			{
				sendMessageToCircle(circleName,stream);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

		
	/*private int getStreamByCircleID(String circleID)
	{
		StreamCircle streamCircle = (StreamCircle) getCurrentSession().createCriteria(StreamCircle.class)
			.add(Restrictions.eq("circleID", circleID)).uniqueResult();
		if(streamCircle==null)
		{
			return -1;
		}
		return streamCircle.getStreamID();
	}
	*/

	


	/*public List<Stream> getMessages(String userID) {
		
		List<String> myCircles=  circleDAO.getMyCircles(userID);
		List<Stream> allStreams = new ArrayList<Stream>();
		List<Stream> circleStream;
		for( String circleName : myCircles)
		{
			circleStream = getMessagesFromCircle(circleName);
			if(circleStream!=null)
			{
				allStreams.addAll(circleStream);
			}
			
		}
		// TODO Auto-generated method stub
		return allStreams;
	}*/


	
}
