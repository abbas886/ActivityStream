package com.stackroot.activity.builder;

import java.util.SortedMap;

import com.stackroot.activity.model.Stream;

public interface InboxBuilder {
	
	public SortedMap<Long, Stream> getMyInbox(String userID);

}
