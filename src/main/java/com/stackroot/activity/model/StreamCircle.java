package com.stackroot.activity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//check and delete table and do
@Component
@Entity
@Table(name ="stream_circle")
public class StreamCircle extends BaseDomain{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column(name ="stream_id")
	private int streamID;
	@Column(name ="circle_id")
	private String circleID;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStreamID() {
		return streamID;
	}
	public void setStreamID(int streamID) {
		this.streamID = streamID;
	}
	public String getCircleID() {
		return circleID;
	}
	public void setCircleID(String circleID) {
		this.circleID = circleID;
	}

}
