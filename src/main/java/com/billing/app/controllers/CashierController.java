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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.billing.app.models.CashierModel;
import com.billing.app.services.CashierService;

@RestController
@RequestMapping("cashier")
// baseURL = http://localhost:8080/cashier
@CrossOrigin(origins = "http://localhost:3000/")
public class CashierController {

	@Autowired
	private CashierService cashierService;

	@PostMapping("")
	public ResponseEntity<CashierModel> addNewCashier(@RequestBody CashierModel model) {
		return new ResponseEntity<CashierModel>(cashierService.addCashier(model), HttpStatus.CREATED);
	}

	@GetMapping("")
	public ResponseEntity<List<CashierModel>> viewAllCashier() {
		return new ResponseEntity<List<CashierModel>>(cashierService.viewCashiers(), HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<CashierModel> viewOneCashier(@PathVariable Integer id) {
		return new ResponseEntity<CashierModel>(cashierService.viewCashier(id), HttpStatus.FOUND);
	}

	@PutMapping("")
	public ResponseEntity<CashierModel> updateCashier(@RequestBody CashierModel model) {
		return new ResponseEntity<CashierModel>(cashierService.updateCashier(model), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<CashierModel> deleteCashier(@PathVariable Integer id) {
		return new ResponseEntity<CashierModel>(cashierService.deleteCashier(id), HttpStatus.OK);
	}

	@GetMapping("l")
	public ResponseEntity<CashierModel> loginCashier(@RequestParam String cashierEmail,
			@RequestParam String cashierPassword) {
		return new ResponseEntity<CashierModel>(cashierService.loginCashier(cashierEmail, cashierPassword),
				HttpStatus.ACCEPTED);
	}
}
