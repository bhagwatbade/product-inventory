package com.productInventory.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productInventory.icontroller.IProductController;
import com.productInventory.imodel.IProductModel;
import com.productInventory.iservice.IProductService;

/**
 * Provide product services to client
 * 
 * @author bhagwat
 *
 */
@RestController
public class ProductController implements IProductController {
	
	@Autowired
	IProductService productService;

	@Override
	@GetMapping(value = "/getProducts")
	public ResponseEntity<Set<IProductModel>> getProducts( ) {
		Set<IProductModel> products = this.productService.getProducts();
		ResponseEntity<Set<IProductModel>> responseEntity = ResponseEntity.accepted().body(products);
		return responseEntity;
	}

}
