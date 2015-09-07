package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProductSubCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6621278370202840696L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String subCategoryName;
	
	@OneToMany
	private List<AppImage> productSubCategoryImage;
	
	@ManyToOne
	private ProductCategory productCatgory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<AppImage> getProductSubCategoryImage() {
		return productSubCategoryImage;
	}

	public void setProductSubCategoryImage(List<AppImage> productSubCategoryImage) {
		this.productSubCategoryImage = productSubCategoryImage;
	}

	public ProductCategory getProductCatgory() {
		return productCatgory;
	}

	public void setProductCatgory(ProductCategory productCatgory) {
		this.productCatgory = productCatgory;
	}

}
