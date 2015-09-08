package com.app.lokalkart.services;

import java.util.List;

import com.app.lokalkart.entities.GuidedTour;
import com.app.lokalkart.entities.ProductSubCategory;

public interface GuidedTourService extends GenericService<GuidedTour, Long>{

	List<GuidedTour> getGuidedTourForProductSubCategory(ProductSubCategory productSubCategory);
}
