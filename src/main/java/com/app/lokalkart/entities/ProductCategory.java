package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

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
public class ProductCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 421722446155285384L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long catId;
	
	private String categoryName;
	
	@OneToMany
	private List<AppImage> productCategoryImage;
	
	@OneToMany
	private Set<ProductSubCategory> subCategories;

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<AppImage> getProductCategoryImage() {
		return productCategoryImage;
	}

	public void setProductCategoryImage(List<AppImage> productCategoryImage) {
		this.productCategoryImage = productCategoryImage;
	}

	public Set<ProductSubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Set<ProductSubCategory> subCategories) {
		this.subCategories = subCategories;
	}

}
