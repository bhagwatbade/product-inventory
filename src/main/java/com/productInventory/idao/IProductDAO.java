package com.productInventory.idao;

import java.util.Set;

import com.productInventory.ientity.IProduct;

/**
 * Product DAO handle persistent operation for product
 * 
 * @author bhagwat
 *
 */
public interface IProductDAO extends IDAO {

	/**
	 * Provide all products
	 * 
	 * @return
	 */
	public Set<IProduct> getProducts();
}
