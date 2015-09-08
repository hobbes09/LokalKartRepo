package com.app.lokalkart.services;

import java.util.List;

import com.app.lokalkart.entities.Product;
import com.app.lokalkart.entities.Retailer;

public interface RetailerService extends GenericService<Retailer, Long>{
	
	List<Retailer> getAllRetailerForProductByLocation(Product product, String pinCode);
	
}
