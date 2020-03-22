package com.productInventory.entity;

import com.productInventory.ientity.IProduct;

/**
 *  Entity represent product
 * 
 * @author bhagwat
 *
 */
public class Product implements IProduct {

	private Long productId;

	private String productName;

	private Double productPrice;

	private String productSpecification;
	
	public Product() {
	}

	public Product(Long productId, String productName, Double productPrice, String productSpecification) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productSpecification = productSpecification;
	}

	@Override
	public Long getProductId() {
		return productId;
	}

	@Override
	public String getProductName() {
		return productName;
	}

	@Override
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public Double getProductPrice() {
		return productPrice;
	}

	@Override
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String getProductSpecification() {
		return productSpecification;
	}

	@Override
	public void setProductSpecification(String productSpecification) {
		this.productSpecification = productSpecification;
	}

	
	/**
	 * product haschcode generated using productId
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}

	/**
	 * product uniqueness depends productId  
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	
	
}
