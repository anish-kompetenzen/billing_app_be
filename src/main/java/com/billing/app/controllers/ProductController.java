package com.billing.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.app.models.ProductModel;
import com.billing.app.services.ProductService;

@RestController
@RequestMapping("product")
// baseURL = http://localhost:8080/cashier
@CrossOrigin(origins = "http://localhost:3000/")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("")
	public ResponseEntity<ProductModel> addNewProduct(@RequestBody ProductModel model) {
		return new ResponseEntity<ProductModel>(productService.addProduct(model), HttpStatus.CREATED);
	}

	@GetMapping("")
	public ResponseEntity<List<ProductModel>> viewProducts() {
		return new ResponseEntity<List<ProductModel>>(productService.viewProducts(), HttpStatus.CREATED);
	}

	@PutMapping("inc/{id}")
	public ResponseEntity<ProductModel> increaseQuantity(@PathVariable Integer id) {
		return new ResponseEntity<>(productService.increaseProductQty(id), HttpStatus.ACCEPTED);
	}

	@PutMapping("dec/{id}")
	public ResponseEntity<ProductModel> decreaseQuantity(@PathVariable Integer id) {
		return new ResponseEntity<>(productService.decreaseProductQty(id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<ProductModel> deleteProduct(@PathVariable Integer id) {
		return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
	}

	@PutMapping("")
	public ResponseEntity<ProductModel> updateProduct(@RequestBody ProductModel model) {
		return new ResponseEntity<>(productService.updateProduct(model), HttpStatus.ACCEPTED);
	}

}
