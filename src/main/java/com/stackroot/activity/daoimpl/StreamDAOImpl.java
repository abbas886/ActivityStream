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

import com.stackroot.activity.dao.CircleDAO;
import com.stackroot.activity.dao.StreamDAO;
import com.stackroot.activity.model.Circle;
import com.stackroot.activity.model.Stream;
import com.stackroot.activity.model.StreamCircle;

@Repository("streamDAO")
@Transactional
public class StreamDAOImpl implements StreamDAO {
	private static final Logger logger = LoggerFactory.getLogger(StreamDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public StreamDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<Stream> getMessages(List<String> circleNames) {
		// TODO Auto-generated method stub
		return null;
	}

	private Circle getCircleByName(String circleName) {
		return (Circle) getCurrentSession().createCriteria(Circle.class).add(Restrictions.eq("name", circleName))
				.uniqueResult();
	}

	public boolean sendMessageToCircle(String circleName, Stream stream) {
		try {
			stream.setCurrentDate();
			getCurrentSession().save(stream);
			StreamCircle streamCircle = new StreamCircle();
			streamCircle.setId((int) (Math.random() * 1000000));
			streamCircle.setStreamID(stream.getId());
			if (getCircleByName(circleName) == null) {
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
			for (String circleName : circleNames) {
				sendMessageToCircle(circleName, stream);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * select * from stream where receiver_id='Abbas' or sender_id='Abbas' or
	 * circle_id in (select circle_id from user_circle where user_id='Abbas')
	 */
	@SuppressWarnings("unchecked")
	public List<Stream> getMyInbox(String userID) {
		logger.debug("getMyInbox: " + userID);

		List<Stream> streams = getMyInbox(userID, 1, 10);
		logger.debug("No. of messages : " + streams.size());

		return streams;
	}

	@SuppressWarnings("unchecked")
	public List<Stream> getMyInbox(String userID, int firstResult, int maxResult) {
		logger.debug("getMyInbox: " + userID + " from " + firstResult + " to " + maxResult);

		List<Stream> streams = getCurrentSession()
				.createQuery("from Stream where receiverID=? or senderID=?"
						+ " or circleID in (select circleID from UserCircle where userID=?)")
				.setString(0, userID).setString(1, userID).setString(2, userID).setFirstResult(firstResult)
				.setMaxResults(maxResult).list();
		logger.debug("No. of messages : " + streams.size());

		return streams;
	}

	/**
	 * select * from Stream where ID in (select stream_ID from Stream_Circle
	 * where circle_ID='hobes')
	 */
	@SuppressWarnings("unchecked")
	public List<Stream> getMyCircleMessages(String circleID) {
		logger.debug("getMessagesFromCircle: " + circleID);
		List<Stream> streams = getMyCircleMessages(circleID, 1, 10);
		logger.debug("No. of messages : " + streams.size());

		return streams;
	}

	@SuppressWarnings("unchecked")
	public List<Stream> getMyCircleMessages(String circleID, int firstResult, int maxResult) {
		logger.debug("getMessagesFromCircle: " + circleID + "  from " + firstResult + " to " + maxResult);
		List<Stream> streams = getCurrentSession()
				.createQuery("from Stream where ID in (select streamID from StreamCircle where circleID=?)")
				.setString(0, circleID).setFirstResult(firstResult).setMaxResults(maxResult).list();
		logger.debug("No. of messages : " + streams.size());

		return streams;
	}

}
