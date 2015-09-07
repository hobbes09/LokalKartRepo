package com.app.lokalkart.services;

import java.util.List;

import com.app.lokalkart.entities.Product;
import com.app.lokalkart.entities.Retailer;

public interface ProductService extends GenericService<Product, Long>{
	
	List<Product> getProductListByRetailer(Retailer retailer);

}
