package com.productInventory.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.productInventory.config.ProductInventoryApplication;
import com.productInventory.imodel.IProductModel;
import com.productInventory.iservice.IProductService;


/**
 * 	Test product services
 * 
 * @author bhagwat
 *
 */
@SpringBootTest(classes = ProductInventoryApplication.class)
public class ProductServiceTest {

	@Autowired
	private IProductService productService;
	
	@Test
	public void getProductsTest(){
		Set<IProductModel> products = productService.getProducts();
		assertTrue((products != null && !products.isEmpty()));
	}
}
