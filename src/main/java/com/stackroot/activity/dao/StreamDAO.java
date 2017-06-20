package com.stackroot.activity.dao;

import java.util.List;
import java.util.SortedMap;

import com.stackroot.activity.model.Circle;
import com.stackroot.activity.model.Stream;

public interface StreamDAO {
	
	//public List<Stream> getMessagesFromCircles(List<String> circleNames);
	
	/*public List<Stream> getMessagesFromCircle(String circleName); 
	
	public List<Stream> getMessages(String userID); 
	*/
	
	// not using...need to remove
	public boolean sendMessageToCircle(String circleName,Stream stream);
	
	public boolean sendMessage(Stream stream);
	
	public boolean sendMessageToUser(String userID,Stream stream);
	
	public boolean sendMessageToCircles(List<String> circleNames,Stream stream);

}
