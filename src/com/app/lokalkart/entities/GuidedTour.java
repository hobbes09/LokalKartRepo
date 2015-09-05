package com.app.lokalkart.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class GuidedTour implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2311151026574181780L;

	private Long tourId;
	
	@OneToOne
	private ProductSubCategory subCat;
	
	private List<TourSet> tourSets;
	
	private class TourSet{
		
		private AppImage image;
		private String description;
	}
}
