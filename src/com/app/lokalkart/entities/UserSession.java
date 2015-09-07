package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserSession implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8382556651018769680L;
	
	@Id
	private String sessionId;
	private Date creationTime;
	private Date loginTime;
	private Date logoutTime;
	@ManyToOne
	private User user;
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Date getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
