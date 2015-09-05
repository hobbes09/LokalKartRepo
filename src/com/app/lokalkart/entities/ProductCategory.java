package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

}
