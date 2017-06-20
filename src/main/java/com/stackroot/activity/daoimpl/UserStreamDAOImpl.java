package com.stackroot.activity.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroot.activity.dao.UserStreamDAO;
import com.stackroot.activity.model.Stream;


@Transactional
@Repository("userStreamDAO")
public class UserStreamDAOImpl implements  UserStreamDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(UserStreamDAOImpl.class);

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserStreamDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	/*@SuppressWarnings("unchecked")
	public List<UserStream> getMyInbox(String userID) {
		return getCurrentSession().createCriteria(UserStream.class)
		.add(Restrictions.eq("userID", userID)).list();
	}

	@SuppressWarnings("unchecked")
	public List<UserStream> getMyCircleMessages(String circleID) {
		return getCurrentSession().createCriteria(UserStream.class)
				.add(Restrictions.eq("circleID", circleID)).list();
	}*/
	
	/**
	 * select * from stream where receiver_id='Abbas' or sender_id='Abbas'
	 or circle_id in (select circle_id from user_circle where user_id='Abbas')
	 */
	@SuppressWarnings("unchecked")
	public List<Stream> getMyInbox(String userID) {
		logger.debug("getMyInbox: "+userID);
		
		List<Stream> streams =  getCurrentSession().createSQLQuery("select * from stream where receiver_id=? or sender_id=?"
				+ " or circle_id in (select circle_id from user_circle where user_id=?)")
				.setString(0, userID)
				.setString(1, userID)
				.setString(2, userID)
				.setFirstResult(1)
				.setMaxResults(10)
				.list();
		logger.debug("No. of messages : " + streams.size());
		
		
		return streams;
	}
    /**
     * select * from Stream where ID in (select stream_ID from Stream_Circle where circle_ID='hobes')
     */
	@SuppressWarnings("unchecked")
	public List<Stream> getMyCircleMessages(String circleID) {
		logger.debug("getMessagesFromCircle: "+circleID);
		List<Stream> streams =  getCurrentSession().createQuery("from Stream where ID in (select streamID from StreamCircle where circleID=?)")
		.setString(0, circleID)
		.setFirstResult(1)
		.setMaxResults(10)
		.list();
		logger.debug("No. of messages : " + streams.size());
		
		return streams;
	}

	/**
	 * fetch user messages from firstResult to size(number of records)
	 */
	@SuppressWarnings("unchecked")
	public List<Stream> getMyInbox(String userID, int firstResult, int maxResult) {
		return getCurrentSession().createCriteria(Stream.class)
				.add(Restrictions.eq("receiverID",userID))
				.setFirstResult(firstResult)
				.setMaxResults(maxResult)
		.list();
	
	}

	@SuppressWarnings("unchecked")
	public List<Stream> getMyCircleMessages(String circleID, int firstResult, int maxResult) {
		return getCurrentSession().createCriteria(Stream.class)
			.add(Restrictions.eq("circleID",circleID))
			.setFirstResult(firstResult)
			.setMaxResults(maxResult)
	.list();}
	
	
	

}
