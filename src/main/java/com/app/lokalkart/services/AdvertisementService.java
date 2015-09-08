package com.app.lokalkart.services;

import java.util.List;

import com.app.lokalkart.entities.Advertisement;
import com.app.lokalkart.entities.ProductSubCategory;
import com.app.lokalkart.entities.Retailer;

public interface AdvertisementService extends GenericService<Advertisement, Long>{
	
	List<Advertisement> getAdsByRetailer(Retailer retailer);
	List<Advertisement> getAdsByLocation(Long pinCode);
	List<Advertisement> getAdsByProductSubCategory(ProductSubCategory productSubCategory);

}
