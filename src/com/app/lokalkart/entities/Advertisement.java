package com.app.lokalkart.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertisement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8718540510005382120L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Retailer retailer;
	private AppImage adImage;
	private Product product;

}
