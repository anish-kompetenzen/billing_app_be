package com.billing.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billing.app.models.CashierModel;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<CashierModel, Integer> {

	public List<CashierModel> findByCashierEmail(String cashierEmail);

	public List<CashierModel> findByCashierEmailAndCashierPassword(String cashierEmail, String cashierPassword);
}
