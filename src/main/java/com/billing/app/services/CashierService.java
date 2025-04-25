package com.billing.app.services;

import java.util.List;

import com.billing.app.models.CashierModel;

public interface CashierService {

	public CashierModel addCashier(CashierModel model);

	public CashierModel updateCashier(CashierModel model);

	public CashierModel deleteCashier(Integer id);

	public CashierModel viewCashier(Integer id);

	public List<CashierModel> viewCashiers();

	public CashierModel loginCashier(String cashierEmail, String cashierPassword);
}
