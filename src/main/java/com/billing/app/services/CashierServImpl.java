package com.billing.app.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.app.models.BillDTO;
import com.billing.app.models.BillModel;
import com.billing.app.models.CashierModel;
import com.billing.app.repositories.BillRepository;
import com.billing.app.repositories.UserRepository;

@Service
public class CashierServImpl implements CashierService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private BillRepository billRepository;

	@Autowired
	private ProductService productService;

	@Override
	public CashierModel addCashier(CashierModel model) {
		List<CashierModel> user = repository.findByCashierEmail(model.getCashierEmail());
		if (user.isEmpty()) {
			return repository.save(model);
		}
		return new CashierModel();
	}

	@Override
	public CashierModel updateCashier(CashierModel model) {
		Optional<CashierModel> op = repository.findById(model.getCashierId());
		if (op.isPresent()) {
			return repository.save(model);
		}
		return new CashierModel();
	}

	@Override
	public CashierModel deleteCashier(Integer id) {
		Optional<CashierModel> op = repository.findById(id);
		if (op.isPresent()) {
			repository.deleteById(id);
			return op.get();
		}
		return new CashierModel();
	}

	@Override
	public CashierModel viewCashier(Integer id) {
		Optional<CashierModel> op = repository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return new CashierModel();
	}

	@Override
	public List<CashierModel> viewCashiers() {
		return repository.findAll();
	}

	@Override
	public CashierModel loginCashier(String cashierEmail, String cashierPassword) {
		List<CashierModel> user = repository.findByCashierEmailAndCashierPassword(cashierEmail, cashierPassword);
		if (user.isEmpty()) {
			return new CashierModel();
		}
		return user.get(0);
	}

	@Override
	public String generateBill(String name, List<BillDTO> dto) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		String formattedTime = LocalTime.now().format(formatter);
		int customerId = billRepository.findMaxCustomerId() != null ? billRepository.findMaxCustomerId() + 1 : 1;
		for (BillDTO bill : dto) {
			BillModel bm = new BillModel();
			bm.setBillDate(LocalDate.now().toString());
			bm.setBillTime(formattedTime.toUpperCase());
			bm.setCashierName(name);
			bm.setProductId(bill.getProductId());
			bm.setProductName(bill.getProductName());
			bm.setProductManufacturer(bill.getProductManufacturer());
			bm.setProductPrice(bill.getProductPrice());
			bm.setProductPurchaseQuantity(bill.getProductPurchaseQty());
			bm.setCustomerId(customerId);
			productService.decreaseProductQty(bill.getProductId(), bill.getProductPurchaseQty());
			billRepository.save(bm);
		}
		return "success";
	}

	@Override
	public List<BillModel> viewAllBills() {
		return billRepository.findAll();
	}

}
