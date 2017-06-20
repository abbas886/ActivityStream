package com.stackroot.activity.model;

import javax.persistence.Transient;

public class BaseDomain {
	
	//not persist OR not store in DB
		@Transient
		public String statusCode;
		@Transient
		public String statusMessage;
		public String getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
		public String getStatusMessage() {
			return statusMessage;
		}
		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}
		
		


}
