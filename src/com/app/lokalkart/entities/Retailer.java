package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Retailer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5133650324647129283L;

	private Long retailerId;
	
	private String retailerName;
	
	@OneToMany
	private List<Address> address;

}
