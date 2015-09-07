/*
 * 
 */
package com.app.lokalkart.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Rohit Ranjan
 *
 * @param <T>
 * @param <PK>
 */
public interface GenericDao <T, PK extends Serializable> {

   /**
    * 
    * @return
    */
    List<T> getAll();
    
    /**
     * 
     * @return
     */
    List<T> getAllDistinct();
    
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
     * @param queryName
     * @param queryParams
     * @return
     */
    List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams);
}
