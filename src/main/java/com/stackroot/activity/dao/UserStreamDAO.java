package com.stackroot.activity.dao;

import java.util.List;

import com.stackroot.activity.model.Stream;

public interface UserStreamDAO {

	public List<Stream> getMyInbox(String userID);

	public List<Stream> getMyCircleMessages(String circleID);

	public List<Stream> getMyInbox(String userID, int firstResult, int maxResult);

	public List<Stream> getMyCircleMessages(String circleID, int firstResult, int maxResult);

}
