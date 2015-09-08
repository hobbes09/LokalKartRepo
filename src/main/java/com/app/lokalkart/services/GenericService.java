/*
 * 
 */
package com.app.lokalkart.services;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Rohit Ranjan
 *
 * @param <T>
 * @param <PK>
 */
public interface GenericService<T, PK extends Serializable> {
	
	/**
	 * 
	 * @return
	 */
    List<T> getAll();
    
    /**
     * 
     * @param id
     * @return
     */
    T get(PK id);
    
    /**
     * 
     * @param id
     * @return
     */
    boolean exists(PK id);
    
    /**
     * 
     * @param object
     * @return
     */
    T save(T object);
    
    /**
     * 
     * @param id
     */
    void remove(PK id);
    
    /**
     * 
     * @param searchTerm
     * @param clazz
     * @return
     */
    List<T> search(String searchTerm, Class<?> clazz);

}
