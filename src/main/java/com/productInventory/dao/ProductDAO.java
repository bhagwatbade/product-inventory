package com.productInventory.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.productInventory.entity.Product;
import com.productInventory.idao.IProductDAO;
import com.productInventory.ientity.IProduct;

/**
 * 
 * @author bhagwat
 *
 */
@Component
public class ProductDAO implements IProductDAO {

	@Override
	public Set<IProduct> getProducts() {
		Set<IProduct> products = new HashSet<>();
		
		for(long i = 0; i < 10; i++){
			IProduct product = new Product(i, "product " + i, new Double(i * 1000), "specification " + i);
			products.add(product);
		}
		
		return products;
	}

}
