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

/**
 * 
 * @author Rohit Ranjan
 *
 */
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Double getMaxRetailPrice() {
		return maxRetailPrice;
	}

	public void setMaxRetailPrice(Double maxRetailPrice) {
		this.maxRetailPrice = maxRetailPrice;
	}

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public List<AppImage> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<AppImage> productImages) {
		this.productImages = productImages;
	}

	public List<PaymentType> getPaymentTypes() {
		return paymentTypes;
	}

	public void setPaymentTypes(List<PaymentType> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}

	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Double getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(Double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public TechnicalSpecification getTechSpecification() {
		return techSpecification;
	}

	public void setTechSpecification(TechnicalSpecification techSpecification) {
		this.techSpecification = techSpecification;
	}

	public List<String> getKeyFeatures() {
		return keyFeatures;
	}

	public void setKeyFeatures(List<String> keyFeatures) {
		this.keyFeatures = keyFeatures;
	}
	
	//@TODO Product Review and Ratings

}
