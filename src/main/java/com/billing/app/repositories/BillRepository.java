package com.billing.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.billing.app.models.BillModel;

public interface BillRepository extends JpaRepository<BillModel, Integer> {

	@Query("select max(customerId) from BillModel")
	public Integer findMaxCustomerId();
}
