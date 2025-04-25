package com.billing.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.app.models.CashierModel;
import com.billing.app.repositories.UserRepository;

@Service
public class CashierServImpl implements CashierService {

	@Autowired
	private UserRepository repository;

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

}
