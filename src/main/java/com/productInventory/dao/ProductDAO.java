package com.productInventory.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.productInventory.entity.Product;
import com.productInventory.idao.IProductDAO;
import com.productInventory.ientity.IProduct;

/**
 *  Product DAO handle persistent operation for product
 * 
 * @author bhagwat
 *
 */
@Component
public class ProductDAO implements IProductDAO {

	@Override
	public Set<IProduct> getProducts() {
		Set<IProduct> products = new HashSet<>();
		
		products.add(new Product(6258l, "mobile", 12000.56, "New nokia mobile"));
		products.add(new Product(143963l, "laptop", 456747.00, "best latop in price this price"));
		products.add(new Product(5723l, "camera", 15674.89, "camera era over"));
		products.add(new Product(28364l, "bag", 768.58, "school bag"));
		products.add(new Product(73824l, "mouse", 899.00, "for office use only"));
		products.add(new Product(1377l, "power bank", 1199.00, "10000amp"));
		products.add(new Product(26354l, "wallet", 1875.66, "lather wallet"));
		products.add(new Product(84280l, "box", 399.99, "lunch box"));
		products.add(new Product(92384l, "basket", 768.58, "big basket"));
		products.add(new Product(34768l, "soap", 768.58, "use daily"));
		products.add(new Product(514924l, "calculator", 2500.00, "Math calculation"));
		products.add(new Product(46238l, "remote", 200.00, "TV remote"));
		products.add(new Product(24322l, "charger", 3599.00, "charger for PC"));
		products.add(new Product(5879721l, "printer", 8000.00, "print copies"));
		products.add(new Product(256192l, "headphones", 1599.00, "wireless headphones"));
		
		return products;
	}

}
