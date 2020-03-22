package com.productInventory.model;

import com.productInventory.entity.Product;
import com.productInventory.ientity.IProduct;
import com.productInventory.imodel.IProductModel;

/**
 * 	Product Model represent product entity
 * 
 * @author bhagwat
 *
 */
public class ProductModel implements IProductModel {
	
	private IProduct product;
	
	public ProductModel() {
		super();
		product = new Product();
	}

	public ProductModel(Long productId, String productName, Double productPrice, String productSpecification) {
		super();
		product = new Product(productId, productName, productPrice, productSpecification);
	}
	
	@Override
	public Long getProductId() {
		return product.getProductId();
	}

	@Override
	public String getProductName() {
		return product.getProductName();
	}

	@Override
	public void setProductName(String productName) {
		product.setProductName(productName);
	}

	@Override
	public Double getProductPrice() {
		return product.getProductPrice();
	}

	@Override
	public void setProductPrice(Double productPrice) {
		product.setProductPrice(productPrice);
	}

	@Override
	public String getProductSpecification() {
		return product.getProductSpecification();
	}

	@Override
	public void setProductSpecification(String productSpecification) {
		product.getProductSpecification();
	}

}
