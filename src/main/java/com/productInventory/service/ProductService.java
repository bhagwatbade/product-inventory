package com.productInventory.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productInventory.idao.IProductDAO;
import com.productInventory.ientity.IProduct;
import com.productInventory.imodel.IProductModel;
import com.productInventory.iservice.IProductService;
import com.productInventory.model.ProductModel;

/**
 * common services for product
 * @author bhagwat
 *
 */
@Service
public class ProductService implements IProductService {
	
	@Autowired
	IProductDAO productDAO;

	@Override
	public Set<IProductModel> getProducts() {
		Set<IProductModel> productModels = new HashSet<>();
		Set<IProduct> products = this.productDAO.getProducts();
		for(IProduct product : products){
			IProductModel productModel = new ProductModel(product.getProductId(), product.getProductName(), product.getProductPrice(), product.getProductSpecification());
			productModels.add(productModel);
		}
		return productModels;
	}

}
