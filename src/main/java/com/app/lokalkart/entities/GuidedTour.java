package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 
 * @author Rohit Ranjan
 *
 */
@Entity
public class GuidedTour implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2311151026574181780L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long tourId;
	
	@OneToOne
	private ProductSubCategory subCat;
	
	private List<TourSet> tourSets;
	
	private class TourSet{
		
		private AppImage image;
		private String description;
		
	}

	public Long getTourId() {
		return tourId;
	}

	public void setTourId(Long tourId) {
		this.tourId = tourId;
	}

	public ProductSubCategory getSubCat() {
		return subCat;
	}

	public void setSubCat(ProductSubCategory subCat) {
		this.subCat = subCat;
	}

	public List<TourSet> getTourSets() {
		return tourSets;
	}

	public void setTourSets(List<TourSet> tourSets) {
		this.tourSets = tourSets;
	}
}
