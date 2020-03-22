package com.productInventory.ientity;

/**
 * represent product
 * 
 * @author bhagwat
 *
 */
public interface IProduct extends IEntity {
	
	/**
	 * Unique Id for each product
	 * @return
	 */
	public Long getProductId();

	/**
	 * 
	 * @return product name
	 */
	public String getProductName();
	
	/**
	 * set name of productOs
	 * @param productName
	 */
	public void setProductName(String productName);
	
	/**
	 * 
	 * @return price of product
	 */
	public Double getProductPrice();

	/**
	 * set price of product
	 * @param productPrice
	 */
	public void setProductPrice(Double productPrice);
	
	/**
	 * 
	 * @return product specification
	 */
	public String getProductSpecification();

	/**
	 * set specification of product
	 * @param productSpecification
	 */
	public void setProductSpecification(String productSpecification);

}
