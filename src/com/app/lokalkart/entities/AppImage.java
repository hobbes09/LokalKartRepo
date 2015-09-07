package com.app.lokalkart.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppImage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2703161528253543724L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long imageId;
	
	private String imageUrl;
	private ProductImageSize imageSize;
	
	public Long getImageId() {
		return imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public ProductImageSize getImageSize() {
		return imageSize;
	}
	public void setImageSize(ProductImageSize imageSize) {
		this.imageSize = imageSize;
	}

}
