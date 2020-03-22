package com.productInventory.icontroller;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.productInventory.imodel.IProductModel;

/**
 * Provide product services to client
 * 
 * @author bhagwat
 *
 */

public interface IProductController extends IController {

	/**
	 * provide list of product to client
	 */
	ResponseEntity<Set<IProductModel>> getProducts();
	
}
