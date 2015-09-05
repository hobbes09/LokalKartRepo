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
	
	

}
