package com.billing.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cashier_details")
public class CashierModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cashier_id")
	private Integer cashierId;
	@Column(name = "cashier_name")
	private String cashierName;
	@Column(name = "cashier_email")
	private String cashierEmail;
	@Column(name = "cashier_password")
	private String cashierPassword;

	public Integer getCashierId() {
		return cashierId;
	}

	public void setCashierId(Integer cashierId) {
		this.cashierId = cashierId;
	}

	public String getCashierName() {
		return cashierName;
	}

	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

	public String getCashierEmail() {
		return cashierEmail;
	}

	public void setCashierEmail(String cashierEmail) {
		this.cashierEmail = cashierEmail;
	}

	public String getCashierPassword() {
		return cashierPassword;
	}

	public void setCashierPassword(String cashierPassword) {
		this.cashierPassword = cashierPassword;
	}

	@Override
	public String toString() {
		return "CashierModel [cashierId=" + cashierId + ", cashierName=" + cashierName + ", cashierEmail="
				+ cashierEmail + ", cashierPassword=" + cashierPassword + "]";
	}

	public CashierModel(Integer cashierId, String cashierName, String cashierEmail, String cashierPassword) {
		this.cashierId = cashierId;
		this.cashierName = cashierName;
		this.cashierEmail = cashierEmail;
		this.cashierPassword = cashierPassword;
	}

	public CashierModel() {
	}
}
