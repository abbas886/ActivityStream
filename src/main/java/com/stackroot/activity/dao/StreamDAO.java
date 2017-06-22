package com.stackroot.activity.dao;

import java.util.List;
import java.util.SortedMap;

import com.stackroot.activity.model.Circle;
import com.stackroot.activity.model.Stream;

public interface StreamDAO {
	
	public boolean sendMessageToCircle(String circleName,Stream stream);
	
	public boolean sendMessage(Stream stream);
	
	public boolean sendMessageToUser(String userID,Stream stream);
	
	public boolean sendMessageToCircles(List<String> circleNames,Stream stream);
	
	
	public List<Stream> getMyCircleMessages(String circleID);
	public List<Stream> getMyInbox(String userID);
	
	public List<Stream> getMyCircleMessages(String circleID,int firstResult, int maxResult);
	public List<Stream> getMyInbox(String userID,int firstResult, int maxResult);

}
