package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.app.lokalkart.interfaces.TechnicalSpecification;

@Entity
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1721987419101037995L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productId;
	
	private String itemCode;
	private String productName;
	private String productDescription;
	
	//@TODO change double type to BigInteger
	private Double maxRetailPrice;
	private Double discountPercentage;
	private Double sellingPrice;
	
	@OneToMany
	private List<AppImage> productImages;
	
	@OneToMany
	private List<PaymentType> paymentTypes;
	
	@ManyToOne
	private ProductSubCategory productSubCategory;
	
	private String deliveryTime;
	
	private Double deliveryCharge;
	
	private TechnicalSpecification techSpecification;
	
	private List<String> keyFeatures;
	
	//@TODO Product Review and Ratings

}
