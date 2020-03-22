package com.productInventory.iservice;

import java.util.Set;

import com.productInventory.imodel.IProductModel;

/**
 * 
 * @author bhagwat
 *
 */
public interface IProductService extends IService {

	/**
	 * provide list of all products
	 * 
	 * @return products
	 */
	public Set<IProductModel> getProducts();
}
