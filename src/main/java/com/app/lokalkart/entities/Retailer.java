package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Rohit Ranjan
 *
 */
@Entity
public class Retailer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5133650324647129283L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long retailerId;
	
	private String retailerName;
	
	@OneToMany
	private List<Address> address;

	public Long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(Long retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
