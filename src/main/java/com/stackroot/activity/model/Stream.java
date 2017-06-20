package com.stackroot.activity.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Stream")
public class Stream extends BaseDomain{
	
	@Id 
	private int id;
	
	@Transient
	private int firstResult;
	@Transient
	private int fetchSize;
	
	@Transient
	private int maxSize;

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public int getFetchSize() {
		return fetchSize;
	}

	public void setFetchSize(int fetchSize) {
		this.fetchSize = fetchSize;
	}

	@Column(name="parent_id")
	private String parentID;
	
	@Column(name="sender_id")
	private String senderID;
	
	
	@Column(name="receiver_id")
	private String receiverID;
	
	@Column(name="circle_id")
	private String circleID;
	
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z")

	@Column(name="posted_date")
	private Timestamp postedDate;
	
	@Column(name="stream_type")
	private String streamType;
	
    private String tag;
	
	private String message;
	
	/*@Transient
	private MultipartFile attachment;
	

	private String attachmentURL;
	
	
	public String getAttachmentURL() {
		return attachmentURL;
	}

	public void setAttachmentURL(String attachmentURL) {
		this.attachmentURL = attachmentURL;
	}

	public MultipartFile getAttachment() {
		return attachment;
	}

	public void setAttachment(MultipartFile attachment) {
		this.attachment = attachment;
	}

*/	public String getCircleID() {
		return circleID;
	}

	public void setCircleID(String circleID) {
		this.circleID = circleID;
	}

	public String getReceiverID() {
		return receiverID;
	}

	public void setReceiverID(String receiverID) {
		this.receiverID = receiverID;
	}

	

	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public String getSenderID() {
		return senderID;
	}

	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	public Timestamp getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Timestamp postedDate) {
		this.postedDate = postedDate;
	}
	public void setCurrentDate()
	{
		this.postedDate = new Timestamp(System.currentTimeMillis());
		
	}

	public String getStreamType() {
		return streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
