package com.app.lokalkart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private String country;
	private Long pinCode;
	private String contactNumber;
	
	
}
